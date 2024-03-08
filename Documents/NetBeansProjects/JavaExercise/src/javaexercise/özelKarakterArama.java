
package javaexercise;

import java.util.Scanner;

public class özelKarakterArama {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz : ");
        String metin = scan.nextLine();
        boolean ozelMi = false;
        //metin char donusturuluyor...

        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            ozelMi = false;
            if (ozelKarakterMi(karakter)) {
                ozelMi = true;
                break;
            }

        }
        if (ozelMi) {
            System.out.println("Özel karakter vardır.");

        } else {
            System.out.println("Ozel karakter yoktur.");
        }

    }

    public static boolean ozelKarakterMi(char karakter) {
        String ozelKarakterler = "!@#$%*&+";
        boolean ozelKarakterMi = false;

        for (int i = 0; i < ozelKarakterler.length(); i++) {
            if (ozelKarakterler.charAt(i) == karakter) {
                ozelKarakterMi = true;
                break;

            }

        }
        return ozelKarakterMi;
    }
}
