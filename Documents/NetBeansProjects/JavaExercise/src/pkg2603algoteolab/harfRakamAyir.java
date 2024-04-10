package pkg2603algoteolab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class harfRakamAyir {
    public static void main(String[] args) {
        File dosya = new File("karakter.txt");
        PrintWriter p = null;
        try {
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            p = new PrintWriter(new FileOutputStream(dosya, false));
            Random rnd = new Random();
            for (int i = 1; i < 1000; i++) {
                char c = (char) (rnd.nextInt(74) + '0');
                p.print(c + " ");
                if (i % 100 == 0) {
                    p.println();
                }
            }
            p.close();
            Scanner oku = new Scanner(dosya);
            PrintWriter harf = new PrintWriter(new File("harf.txt"));
            while (oku.hasNext()) {
                String okunan = oku.nextLine();
                String[] dizi = okunan.split(" ");
                for (int i = 0; i < dizi.length; i++) {
                    if (dizi[i].charAt(0) >= 'A' && dizi[i].charAt(0) <= 'Z') {
                        harf.print(dizi[i] + " ");
                    }
                }
                harf.println();
            }
            oku.close();
            harf.close();
            Scanner oku2 = new Scanner(dosya);
            PrintWriter karakter = new PrintWriter(new File("rakam.txt"));
            while (oku2.hasNext()) {
                String okunan = oku2.nextLine();
                String[] dizi = okunan.split(" ");
                for (int i = 0; i < dizi.length; i++) {
                    if (dizi[i].charAt(0) >= '0' && dizi[i].charAt(0) <= '9') {
                        karakter.print(dizi[i] + " ");
                    }
                }
                karakter.println();
            }
            oku2.close();
            karakter.close();
        } catch (Exception e) {
        }
    }
}
