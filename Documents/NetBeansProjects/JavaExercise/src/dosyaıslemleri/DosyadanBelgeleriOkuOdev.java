package dosyaıslemleri;

//    Bir klasörde içerisinde sayılar yazılmış dosyalar bulunmaktadır
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//    bu klasördeki dosyalarda yer alan sayıları okuyarak tümsayılar.txt dosyasına yazdıran
//    ve içinde en fazla sayı barındıran dosya ismini ekrana yazdıran java programını yazınız.
public class DosyadanBelgeleriOkuOdev {

    public static void main(String[] args) {
        String klasorAdi = "sayilarklasor";
        File klasor = new File(klasorAdi);
        int tumToplam = 0;
        int toplamSayiAdedi = 0;
        int maxSayiAdedi = 0;
        String maxDosyaIsmi = "";
        for (File dosya : klasor.listFiles()) {
            if (dosya.isFile()) {
                int sayiAdedi = 0;                      
                try (Scanner scanner = new Scanner(dosya); 
                        FileWriter yazici = new FileWriter("tumSayilar.txt", true);
                        PrintWriter yazdirma = new PrintWriter(yazici)) {
                    while (scanner.hasNextInt()) {
                        int sayi = scanner.nextInt();
                        yazdirma.println(sayi);
                        toplamSayiAdedi++;
                        sayiAdedi++;
                    }
                    if (sayiAdedi > maxSayiAdedi) {
                        maxSayiAdedi = sayiAdedi;
                        maxDosyaIsmi = dosya.getName();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }}}
        System.out.println("En Fazla Sayi Barindiran Dosya: " + maxDosyaIsmi);
        System.out.println("En Fazla sayi adedi: " + maxSayiAdedi);
    }
}
      