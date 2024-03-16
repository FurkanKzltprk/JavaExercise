
package Interface;


public class Yonetici implements IKullanici {

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
    System.out.println("Yonetici giris yapti : "+kullaniciAdi+""+sifre);

    }

    @Override
    public void KayitOl() {
        System.out.println("Yonetici kayit oldu.");
    }

    @Override
    public void mesajGonder() {
        System.out.println("Yonetici mesaj gonderdi.");
    }

    
    
}
