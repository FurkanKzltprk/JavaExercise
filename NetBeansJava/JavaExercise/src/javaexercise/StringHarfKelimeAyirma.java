package javaexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringHarfKelimeAyirma {
    public static void main(String[] args) {
        // Test için main metodu
        ayirVeYaz("girisDosyasi.txt");
    }

    public static void ayirVeYaz(String dosyaAdi) {
        try {
            Scanner scanner = new Scanner(new File(dosyaAdi));
            PrintWriter sayiWriter = new PrintWriter("sayi.txt");
            PrintWriter kelimeWriter = new PrintWriter("kelime.txt");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    // Eğer bir sonraki girdi bir sayı ise, sayı.txt'ye yaz
                    sayiWriter.println(scanner.nextInt());
                } else {
                    // Değilse, kelime.txt'ye yaz
                    kelimeWriter.println(scanner.next());
                }
            }

            scanner.close();
            sayiWriter.close();
            kelimeWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("Dosya bulunamadı: " + e.getMessage());
        }
    }
}
