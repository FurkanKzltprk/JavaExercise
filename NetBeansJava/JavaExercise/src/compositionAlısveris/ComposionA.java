
package compositionAlısveris;


public class ComposionA {

    public static void main(String args[]) {
      Urun urun1 = new Urun("sandalye", "Plastik", 450, 889, 72);
      Urun urun2 = new Urun("Tabure", "Plastik", 120, 897, 150);
      
      
      UrunYonetimi urunYonetimi = new UrunYonetimi(urun1);
      
      urunYonetimi.ekle();
      urunYonetimi.guncelle();
      urunYonetimi.sil();
      
      
      
      
    }
}
