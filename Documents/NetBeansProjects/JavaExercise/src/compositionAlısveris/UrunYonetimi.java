package compositionAlısveris;

public class UrunYonetimi {

    public Urun urun;

    public UrunYonetimi(Urun urun) {

        this.urun = urun;

    }

    public void ekle() {
        System.out.println("Urun eklendi : " + urun.isim);

    }

    public void guncelle() {
        System.out.println("Urun guncellendi : " + urun.kategori);
    }

    public void sil() {
        System.out.println("Urun silindi : " + urun.stok);

    }

}
