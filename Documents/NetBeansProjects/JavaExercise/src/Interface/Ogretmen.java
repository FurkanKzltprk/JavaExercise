
package Interface;
    //giriş yap hepsi için aynıydı abstacta
    // ama kayıt ol özelliği hepsi için farklıydi.
    //burada girisYap , kayıtOl,mesajGonder hepsi farklı.

public class Ogretmen  implements IKullanici {

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
         System.out.println("Ogretmen giris yapti : "+kullaniciAdi+""+sifre);

    }

    @Override
    public void KayitOl() {
        System.out.println("Ogretmen kayit oldu.");
    }

    @Override
    public void mesajGonder() {
        System.out.println("Ogretmen mesaj gonderdi.");
        
    }

    
   
}
