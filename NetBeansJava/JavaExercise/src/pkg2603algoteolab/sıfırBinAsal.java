package pkg2603algoteolab;

import java.io.File;
import java.io.PrintWriter;

//Benim yazdığım kod
public class sıfırBinAsal {

    public static void main(String[] args) {
        File dosya = new File("Asal1234.txt");
        PrintWriter p = null;

        try {
            if (!dosya.exists()) {
                dosya.createNewFile();

            } else {
                System.out.println("Dosya zaten mevcut.");

            }
            p = new PrintWriter(dosya);
            for (int i = 0; i < 1000; i++) {
                if (AsalMi(i) == true) {
                    p.println(i);

                }

            }
            p.close();

        } catch (Exception e) {

        } finally {
            System.out.println("Islem basariyla gerceklestirilidi.");

        }

    }

    public static boolean AsalMi(int sayi) {
//        if (sayi <= 1) {
//            return false;
//
//        }
//        for (int i = 2; i < Math.sqrt(sayi); i++) {
//            if (sayi % i == 0) {
//                return false;
//
//            }
//
//        }
//        return true;
        boolean asal = true;
        for (int i = 2; i < sayi / 2; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }

        }
        return asal;

    }

}
