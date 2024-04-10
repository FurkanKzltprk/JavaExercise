package javaexercise;


import java.io.*;
import java.util.Scanner;

public class diziSıralaGoster {

    public static void goster(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + "\t");
        }

    }

    //okusun diziye yazdrısın dizidekini sıralasın ekranda göstersin.
    public static void main(String[] args) {
        File dosya = new File("sayilar.txt");
        Scanner oku = null;
        try {
            oku = new Scanner(dosya);
            int[] dizi = new int[100];
            int i = 0;
            while (oku.hasNext()) {
                dizi[i] = oku.nextInt();
                i++;

            }
            oku.close();
            goster(dizi);
            for (int j = 0; j < dizi.length - 1; j++) {
                int min_ind = j;
                for (int k = j + 1; k < dizi.length; k++) {
                    if (dizi[k] < dizi[min_ind]) {
                        min_ind = k;
                    }

                }
                if (min_ind != j) {
                    int ara = dizi[min_ind];
                    dizi[min_ind] = dizi[j];
                    dizi[j] = ara;

                }

            }
            System.out.println("\n Siralanmis dizi :");
            goster(dizi);

        } catch (FileNotFoundException e) {
            System.out.println("HATA : " + e.getMessage());

        }

    }

}
