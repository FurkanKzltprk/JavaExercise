
package sarkici_uygulamasi2;

public class SarkiDugum {
    
    String sarkiad;
    String sarkiyol;
    SarkiDugum oncekisarki;
    SarkiDugum sonrakiSarki;

    public SarkiDugum(String sarkiad) {
        this.sarkiad = sarkiad;
        oncekisarki = sonrakiSarki =  null;
        
    }
    
    
    
}
