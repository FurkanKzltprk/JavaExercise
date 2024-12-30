package javaexercise;

import java.util.Scanner;

public class ExceptionHadnling1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        double sonuc;

        while (true) {
            try {
                sonuc = sayi1 / sayi2;
                break;
            } catch (ArithmeticException e) {
                System.out.print("Hata bulundu lutfen 0 harici bir sayi giriniz :");
                sayi2 = scan.nextInt();

            }
        }
        System.out.println("Islemin sonucu : "+sonuc);
    }

}
