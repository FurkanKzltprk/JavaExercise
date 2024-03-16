
package Interface;

     //Ogrenci classımız Interfacemizi kalıtsın.
     //normalde extends le yaparız değil mi ? 
     //Interfacelerde durum değişiyor.
     // implements diyorum

public class Ogrenci implements IKullanici{

    @Override
    public void girisYap(String kullaniciAdi, String sifre) {
        System.out.println("Ogrenci giris yapti : "+kullaniciAdi+" "+sifre);
    }

    @Override
    public void KayitOl() {
        System.out.println("Ogrenci kayit oldu.");
    }

    @Override
    public void mesajGonder() {
        System.out.println("Ogrenci mesaj gonderdi");
    }
    public void sikayetEt(){
        System.out.println("Ogrenci sikayet yazdi.");
    }
    

   
   
  
}
