
package Inheritance;

public class Akademisyen extends Calisan {
    String bolum,gorevler;
    String dersler ;

    public Akademisyen(String bolum, String gorevler, String dersler, String adSoyad, String eposta, String telefon) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler = dersler;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }

   
   
    
    public void derseGir(){
        System.out.println("Derse girildi.");
    }
//    bu metodu akademisyene yazdım bu metod akademisyeni
//   'extends' eden tüm sınıflarda kullanılabilir durumdadır.
    
}
