
package Inheritance;


public class Guvenlik extends Memurlar {
    String belge;

    public Guvenlik(String belge, String departman, String mesai, String adSoyad, String eposta, String telefon) {
        super(departman, mesai, adSoyad, eposta, telefon);
        this.belge = belge;
    }
    
}
