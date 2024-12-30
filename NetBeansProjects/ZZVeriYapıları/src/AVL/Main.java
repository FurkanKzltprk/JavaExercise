// AVL Ağacı için Dugum sınıfı
class Dugum {
    int anahtar, yukseklik;
    Dugum sol, sag;

    Dugum(int d) {
        anahtar = d;
        yukseklik = 1; // Yeni düğümün başlangıç yüksekliği
    }
}

// AVL Ağacı sınıfı
class AvlAgaci {
    Dugum kok;

    // Düğümün yüksekliğini döndürür
    int yukseklik(Dugum dugum) {
        return (dugum == null) ? 0 : dugum.yukseklik;
    }

    // İki sayının maksimumunu döndürür
    int maksimum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Sağ dönüş işlemi
    Dugum sagaDondur(Dugum y) {
        Dugum x = y.sol;
        Dugum T2 = x.sag;

        x.sag = y;
        y.sol = T2;

        // Yükseklikleri güncelle
        y.yukseklik = maksimum(yukseklik(y.sol), yukseklik(y.sag)) + 1;
        x.yukseklik = maksimum(yukseklik(x.sol), yukseklik(x.sag)) + 1;

        return x; // Yeni kök
    }

    // Sol dönüş işlemi
    Dugum solaDondur(Dugum x) {
        Dugum y = x.sag;
        Dugum T2 = y.sol;

        y.sol = x;
        x.sag = T2;

        // Yükseklikleri güncelle
        x.yukseklik = maksimum(yukseklik(x.sol), yukseklik(x.sag)) + 1;
        y.yukseklik = maksimum(yukseklik(y.sol), yukseklik(y.sag)) + 1;

        return y; // Yeni kök
    }

    // Denge faktörü hesaplama
    int dengeFaktoru(Dugum dugum) {
        return (dugum == null) ? 0 : yukseklik(dugum.sol) - yukseklik(dugum.sag);
    }

    // AVL ağacına düğüm ekleme
    Dugum ekle(Dugum dugum, int anahtar) {
        if (dugum == null)
            return new Dugum(anahtar);

        if (anahtar < dugum.anahtar)
            dugum.sol = ekle(dugum.sol, anahtar);
        else if (anahtar > dugum.anahtar)
            dugum.sag = ekle(dugum.sag, anahtar);
        else
            return dugum; // Aynı anahtar eklenemez

        // Yüksekliği güncelle
        dugum.yukseklik = 1 + maksimum(yukseklik(dugum.sol), yukseklik(dugum.sag));

        // Denge faktörünü hesapla
        int denge = dengeFaktoru(dugum);

        // Sol-Sol durumu
        if (denge > 1 && anahtar < dugum.sol.anahtar)
            return sagaDondur(dugum);

        // Sağ-Sağ durumu
        if (denge < -1 && anahtar > dugum.sag.anahtar)
            return solaDondur(dugum);

        // Sol-Sağ durumu
        if (denge > 1 && anahtar > dugum.sol.anahtar) {
            dugum.sol = solaDondur(dugum.sol);
            return sagaDondur(dugum);
        }

        // Sağ-Sol durumu
        if (denge < -1 && anahtar < dugum.sag.anahtar) {
            dugum.sag = sagaDondur(dugum.sag);
            return solaDondur(dugum);
        }

        return dugum;
    }

    // Preorder dolaşımı
    void preorderDolasim(Dugum dugum) {
        if (dugum != null) {
            System.out.print(dugum.anahtar + " ");
            preorderDolasim(dugum.sol);
            preorderDolasim(dugum.sag);
        }
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        AvlAgaci agac = new AvlAgaci();

        // AVL ağacına düğümler ekleniyor
        agac.kok = agac.ekle(agac.kok, 10);
        agac.kok = agac.ekle(agac.kok, 20);
        agac.kok = agac.ekle(agac.kok, 30);
        agac.kok = agac.ekle(agac.kok, 40);
        agac.kok = agac.ekle(agac.kok, 50);
        agac.kok = agac.ekle(agac.kok, 25);

        // Preorder dolaşımı yazdır
        System.out.println("Oluşturulan ağacın preorder dolaşımı:");
        agac.preorderDolasim(agac.kok);
    }
}
