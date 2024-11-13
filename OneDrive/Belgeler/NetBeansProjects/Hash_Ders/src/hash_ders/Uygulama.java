package hash_ders;

public class Uygulama {

    public static void main(String[] args) {

        Tablo htable = new Tablo(5);

        htable.ekle(0, "ahmet"); 
        htable.ekle(10, "mehmet");

        htable.ekle(3, "hasan");
        htable.ekle(4, "huseyin");
        
        htable.ekle(2, "ayse");
        htable.ekle(22, "fatma");

        htable.ekle(15, "beyza");
        
        htable.ekle(9, "ece");

        System.out.println(htable.dizi[3].next.isim);

    }
}
