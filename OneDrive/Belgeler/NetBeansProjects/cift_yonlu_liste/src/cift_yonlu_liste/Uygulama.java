package cift_yonlu_liste;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BagliListe bliste = new BagliListe();

        int secim = -1, sayi, indis;
        while (secim != 0) {

            System.out.println("1-basa ekle");
            System.out.println("2-sona ekle");
            System.out.println("3-araya ekle");
            System.out.println("4-bastan sil");
            System.out.println("5- sondan sil");
            System.out.println("6-sondan basa yazdir ");
            System.out.println("7-listeyi ekrana yazdir");
            System.out.println("8-aradan sil");

            System.out.println("0-cikis");
            System.out.print("seciminiz : ");

            secim = scan.nextInt();

            if (secim == 1) {
                System.out.println("sayi : ");
                sayi = scan.nextInt();
                bliste.basaEkle(sayi);
            } else if (secim == 2) {
                System.out.println("sayi : ");
                sayi = scan.nextInt();
                bliste.sonaEkle(sayi);
            } else if (secim == 3) {
                System.out.println("indis  :");
                indis = scan.nextInt();
                System.out.println("sayi :");
                sayi = scan.nextInt();
                bliste.arayaEkleme(indis, sayi);

            } else if (secim == 4) {

                bliste.bastansil();
                System.out.println("Bastan silme islemi gerceklesti");
            } else if (secim == 5) {
                bliste.bastansil();
                System.out.println("Sondan silme gerceklesti.");
            } else if (secim == 6) {
                bliste.sondanYazdir();
                System.out.println("Sondan basa yazdirildi.");
            } else if (secim == 7) {

                bliste.yazdir();
                System.out.println("Liste bastan sona yazdirildi");

            } else if (secim == 8) {
                System.out.println("indis : ");
                indis = scan.nextInt();

                bliste.aradanSilme(indis);

            } else if (secim == 0) {
                return;
            }
        }

    }

}
