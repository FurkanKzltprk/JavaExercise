package javaexercise;

import java.util.Random;

public class TekCiftBulAdetOrtyazdir {

    public static double[] orthesap(int[] d) {

        double[] sonuc = new double[4];  //2. indis cift sayac.
        // 3. indis tek sayac.

        int tektop = 0, cifttop = 0, tsayac = 0, csayac = 0;

        for (int i = 0; i < d.length; i++) {

            if (d[i] % 2 == 0) {

                cifttop += d[i];
                csayac++;

            } else {
                tektop += d[i];
                tsayac++;
            }

        }

        sonuc[0] = cifttop / (double) csayac;
        sonuc[1] = tektop / (double) tsayac;
        sonuc[2] = csayac;
        sonuc[3] = tsayac;

        return sonuc;

    }

    public static void main(String args[]) {

        Random rastgele = new Random();
        int[] dizi = new int[20];
        for (int i = 0; i < 20; i++) {
            dizi[i] = rastgele.nextInt(100) + 1;
        }

        double[] ortalamaVeAdetDizisi = orthesap(dizi);
        System.out.println("cift sayilarin ortalamasi : " + ortalamaVeAdetDizisi[0]);
        System.out.println("Tek sayilarin ortalamasi : " + ortalamaVeAdetDizisi[1]);
        System.out.println("Cift sayilarin adeti : "+ortalamaVeAdetDizisi[2]);
        System.out.println("Tek sayilarin adeti : "+ortalamaVeAdetDizisi[3]);

    }
}
