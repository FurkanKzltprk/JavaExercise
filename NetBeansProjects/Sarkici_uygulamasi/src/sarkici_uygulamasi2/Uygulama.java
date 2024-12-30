package sarkici_uygulamasi2;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MuzikOynatici sarkilar = new MuzikOynatici();

        //  bana sor - Ferdi tayfur  
        //  sabahci kahvesi - Ferdi tayfur  
        //  baytar - sagopa Kajmer
        //  fark var - Ceza
        //  Seni  yazdım - Müslüm gürses
        
        int secim = -1;
        while (secim != 0) {
            System.out.println("--------------------------------");
            System.out.println("Sarki oynatma uygulamasi secim ekrani");
            System.out.println("--------------------------------");

            System.out.println("1-Sarki ekle ");
            System.out.println("2-sonraki sarki");
            System.out.println("3-onceki sarki");
            System.out.println("4-mevcut sarki oynat");
            System.out.println("5-listenin basina al");
            System.out.println("6-Sarkilari listele");
            System.out.println("0-Cikis");

            System.out.println("yapmak istedigibiz islemi seciniz : ");
            secim = scan.nextInt();

            scan.nextLine();
            switch (secim) {
                case 1:
                    System.out.println("Eklemek istediginiz sarki : ");
                    String sarki = scan.nextLine();
                    sarkilar.SarkiEkle(sarki);
                    break;

                case 2:
                    sarkilar.sonrakiSarki();
                    break;
                case 3:
                    sarkilar.oncekiSarki();
                    break;
                case 4:
                    sarkilar.mevcutSarkiOynat();
                    break;
                case 5:
                    sarkilar.listeninBasinaAl();
                    break;
                case 6:
                    sarkilar.sarkilariListele();
                    break;
                case 0:
                    System.out.println("Cikis yapildi...");
                    break;
                default:
                    System.out.println("Hatali bir secim yaptiniz [0-6]");
                    break;
            }

        }

    }

}
