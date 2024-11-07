package stack2liste;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {
        StackYapisi liste = new StackYapisi(10);
        Scanner scan = new Scanner(System.in);
        int secim = -1;

        while (secim != 0) {
            System.out.println("1 - ekle");
            System.out.println("2 - cikar");
            System.out.println("3 - top goster");
            System.out.println("4 - yazdir");
            System.out.println("0 - cikis");
            System.out.print("secim yap : ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("sayi : ");
                    int sayi = scan.nextInt();
                    liste.push(sayi);
                    break;
                case 2:
                    liste.pop();
                    break;
                case 3:
                    liste.showTop();
                    break;
                case 4:
                    liste.print();
                    break;
                case 0:
                    System.out.println("cikis yaptiniz");
                    break;

                default:
                    System.out.println("hatali secim yaptiniz[0-4] ");
                    break;

            }

        }

    }

}
