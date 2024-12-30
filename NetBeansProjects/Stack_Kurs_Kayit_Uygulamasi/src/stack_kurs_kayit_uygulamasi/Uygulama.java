
package stack_kurs_kayit_uygulamasi;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n , secim = -1 ; 
        System.out.println("Kursa kayit edilecek kisi sayisi : "); n = scan.nextInt();
        KursStack bilgisayarKursliste = new KursStack(n);
        
           while(secim != 0 ){
               System.out.println("1 -kursa yeni kayit ");
               System.out.println("2 -en son kaydi sil");
               System.out.println("3 -kursta kayitli kisiler");
               System.out.println("4 -en son kayitli kisi bilgileri : ");
               System.out.println("5 -Kalan kontenjan bilgileri : ");
               System.out.println("0 - cikis ");
               System.out.print("seciminiz  :");secim = scan.nextInt();
               
               
               switch (secim)
               {
                   case 1: bilgisayarKursliste.ekle();break;
                   case 2: bilgisayarKursliste.sil();break;
                   case 3: bilgisayarKursliste.yazdir();break;
                   case 4: bilgisayarKursliste.enSonKayitOlanKisi();break;
                   case 5: bilgisayarKursliste.kalanKontenjanSayisi();break;
                   case 0: System.out.println("Cikis yaptiniz "); break;
                   default: System.out.println("hatali secim yaptiniz [0-5]");
                   
                   
                   
               }
               
               
               
           }
        
        
        
        
    }
}
