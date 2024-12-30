
package Inheritance;

public class Calisan {
   protected String adSoyad,eposta,telefon;
   
    
    
    protected void giris(){
        System.out.println(this.adSoyad+ " giris yapti!.");
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
//    artık elle yazmıyorum Consturctorları
//    sağTık-InsertCode-Constructor diyorum
//    oradan seçiyorum.
// sectigimde gelen kısım aşağısı ↓↓↓↓↓↓↓↓↓↓↓↓
    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }
    
    
}
