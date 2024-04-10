package pkg2603algoteolab;

//1 dosyaya her satırında 20 tane sayı olacak şekilde üretilen rastgele 
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

//1. soru  sayıları dosyaya yazdıran  ve bu dosyadaki her bir satırın ortalamasını 
// ekranda gösteren bir java programı yazalım (ekleme : ortalamayı yazdır yanına da sayıları yazdır)

//2 bir dosyada  rastgele olarak yazılmış harf ve rakamlar bulunmaktadır harfleri 
// harf.txt  rakamları rakam.txt dosyasında yazdıran kodu yazalım.

public class ilhanHocaSorulara1 {

    public static void main(String[] args) {
        File dosya = new File("sayılar.txt");
        PrintWriter p;
        try {
            Random r = new Random();
            p = new PrintWriter(dosya);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 20; j++) {
                    int sayi = r.nextInt(0, 100);
                    p.print(sayi + " ");

                }
                p.println(); 
            }
            p.close();
        } catch (Exception e) {
        }

    }
    

}
