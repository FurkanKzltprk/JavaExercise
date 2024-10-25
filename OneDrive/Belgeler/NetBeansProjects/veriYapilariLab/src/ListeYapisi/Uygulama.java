package ListeYapisi;

import java.util.Scanner;


// liste yapısı TEK YÖNLÜ BAĞLI LİSTE

public class Uygulama {

    public static void main(String[] args) {
        ListeYapisi liste = new ListeYapisi();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Eklemek istediginiz " + (i) + ". sayiyi girin : ");

            int sayi = scan.nextInt();

            liste.ekle(sayi);
        }

        liste.yazdir();
    }
}
