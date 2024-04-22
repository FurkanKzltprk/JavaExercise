
package Inheritance;

public class Memurlar extends Calisan {
    String departman,mesai;

    public Memurlar(String departman, String mesai, String adSoyad, String eposta, String telefon) {
        super(adSoyad, eposta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }
    
}
