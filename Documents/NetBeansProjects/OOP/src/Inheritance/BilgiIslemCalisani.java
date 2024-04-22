
package Inheritance;


public class BilgiIslemCalisani extends Memurlar { 
    String gorev;

    public BilgiIslemCalisani(String gorev, String departman, String mesai, String adSoyad, String eposta, String telefon) {
        super(departman, mesai, adSoyad, eposta, telefon);
        this.gorev = gorev;
    }
    
    
}
