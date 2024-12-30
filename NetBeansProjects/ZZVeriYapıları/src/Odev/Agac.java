package Odev;

 class Dugum {
    int icerik; // Düğümün içeriği
    Dugum sol;  // Sol alt düğüm
    Dugum sag;  // Sağ alt düğüm

    // Constructor (yapıcı) metot
    public Dugum(int icerik) {
        this.icerik = icerik;
        this.sol = null;
        this.sag = null;
    }
}

public class Agac {
    Dugum kok; // Ağacın kök düğümü

    // Constructor (yapıcı) metot
    public Agac() {
        this.kok = null;
    }

    // Ağaca düğüm ekleme metodu
    public void AgacaEkle(Dugum yeni) {
        Dugum y = null;
        Dugum x = kok;

        // Uygun konumu bulana kadar ilerle
        while (x != null) {
            y = x;
            if (yeni.icerik < x.icerik) {
                x = x.sol;
            } else {
                x = x.sag;
            }
        }

        // Yeni düğümü ekle
        if (y == null) {
            kok = yeni; // Ağaç boşsa kök düğümü ayarla
        } else {
            if (yeni.icerik < y.icerik) {
                y.sol = yeni;
            } else {
                y.sag = yeni;
            }
        }
    }

    // Ağacı in-order gezerek ekrana yazdırma
    public void InOrderYazdir(Dugum dugum) {
        if (dugum != null) {
            InOrderYazdir(dugum.sol); // Sol alt ağaç
            System.out.print(dugum.icerik + " "); // Mevcut düğüm
            InOrderYazdir(dugum.sag); // Sağ alt ağaç
        }
    }

    // Main metodu
    public static void main(String[] args) {
        Agac agac = new Agac(); // Ağacı oluştur

        // Sırasıyla verilen değerleri ekle
        int[] sayilar = {6, 2, 8, 1, 4, 3, 5};
        for (int sayi : sayilar) {
            Dugum yeni = new Dugum(sayi);
            agac.AgacaEkle(yeni);
        }

        // Ağacı in-order gezip ekrana yazdır
        System.out.print("Ağaç elemanları (In-Order): ");
        agac.InOrderYazdir(agac.kok);
    }
}
