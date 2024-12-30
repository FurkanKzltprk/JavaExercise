package Composition;

public class composition {  //bir sınıfın başka bir sınıfı
    // parametre olarak alması. kullanması.

    public static void main(String args[]) {
        Ogrenci ogrenci = new Ogrenci("Furkan", "kızıltoprak", 2321, "Aslan", "Kaplan", "01.01.2003");

        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri(ogrenci);
        //burda bir sınıfı parametre olarak kendi sınıfının içine aldı.
        
        ogrenciIslemleri.ekle(); 

    }
}
