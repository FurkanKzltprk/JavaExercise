package javaexercise;

import java.util.Scanner;

public class HarmonikToplam {

    public static double seriToplami(int m) {
        if (m == 1) {
            return 1.0;

        } else {
            return 1.0 / m + seriToplami(m - 1);
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("m sayisini  giriniz : ");
        int m = scan.nextInt();

        double toplam = seriToplami(m);
        System.out.println("1'den " + m + " ' e kadar olan kesirlerin toplami : " + toplam);

    }
}
