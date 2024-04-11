package dosyaıslemleri;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class dosyadakiTumSayilarToplami {

    public static void main(String[] args) {
        String klasorAdi = "sayilarklasor";
        File klasor = new File(klasorAdi);
        int toplam = 0;
        for (File dosya : klasor.listFiles()) {
            if (dosya.isFile()) {
                try (Scanner scan = new Scanner(dosya); FileWriter yazici = new FileWriter("tumSayilar.txt", true); PrintWriter yazdirma = new PrintWriter(yazici)) {
                    while (scan.hasNextInt()) {
                        int sayi = scan.nextInt();
                        yazdirma.println(sayi);
                        toplam += sayi;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        try (FileWriter toplamYazici = new FileWriter("tumtoplam.txt"); PrintWriter toplamYazdirmaNesnesi = new PrintWriter(toplamYazici)) {
            toplamYazdirmaNesnesi.println("Tum sayilarin toplami :" + toplam);
        } catch (Exception e) {

        }
    }

}
