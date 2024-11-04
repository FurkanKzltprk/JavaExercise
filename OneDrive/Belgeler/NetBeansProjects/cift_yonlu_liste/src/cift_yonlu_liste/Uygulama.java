package cift_yonlu_liste;

public class Uygulama {

    public static void main(String[] args) {
        BagliListe bliste = new BagliListe();
        
        bliste.basaEkle(5);
        bliste.sonaEkle(20);
        bliste.arayaEkleme(1, 7);
        bliste.basaEkle(10);
       
        
        bliste.yazdir();
        System.out.println("");
        bliste.sondanYazdir();
    }
    
}
