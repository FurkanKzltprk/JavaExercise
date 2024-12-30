
package Inheritance;


public class Asistan extends Akademisyen {
protected String yüksekLisans;

    public String getYüksekLisans() {
        return yüksekLisans;
    }

    public void setYüksekLisans(String yüksekLisans) {
        this.yüksekLisans = yüksekLisans;
    }

    public Asistan(String yüksekLisans, String bolum, String gorevler, String dersler, String adSoyad, String eposta, String telefon) {
        super(bolum, gorevler, dersler, adSoyad, eposta, telefon);
        this.yüksekLisans = yüksekLisans;
    }
    
    
}
