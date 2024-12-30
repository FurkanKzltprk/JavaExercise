package javaexercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Asal30Bekle {
    public static void main(String[] args) {
        asalSayilariBulVeYaz();
    }

    public static void asalSayilariBulVeYaz() {
        Scanner scanner = new Scanner(System.in);
        int adet = 0; // Toplam bulunan asal sayı adedi

        try (PrintWriter writer = new PrintWriter(new FileWriter("ASAL.txt"))) {
            while (adet < 30) {
                System.out.print("Bir sayı girin: ");
                int sayi = scanner.nextInt();

                if (isAsal(sayi)) {
                    writer.println(sayi);
                    adet++;
                }
            }
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }

        scanner.close();
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
