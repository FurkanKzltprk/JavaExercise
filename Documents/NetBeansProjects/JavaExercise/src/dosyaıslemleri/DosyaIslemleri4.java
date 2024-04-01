package dosyaıslemleri;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class DosyaIslemleri4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici adi : ");
        String kullaniciAdi = scan.next();
        System.out.println("Sifre : ");
        String sifre = scan.next();
        Date tarih = new Date();

        if (kullaniciAdi.equals("admin") && sifre.equals("12345")) {
            System.out.println("Giris basarili");
            try(FileWriter writer = new FileWriter("GirisKayitlari.txt",true)){
                writer.write(kullaniciAdi+" - "+ tarih.toString()+"\n");
                
            } catch (IOException ex) {
                System.out.println("Dosya olusturulurken bir hata olustu.");
            }
        } else {
            System.out.println("Giris basarisiz");
        }

    }

}
