
package ogrenci.kayit.uygulamasi;

import java.util.Scanner;


public class Uygulama {
    public static void main(String[] args) {
        
        int secim = -1;
        OgrListe bilBolum = new OgrListe();
        Scanner scan = new Scanner(System.in);
        
        while(secim != 0){
            System.out.println("Yazilim bolumu ogrenci kayit uygulamasi : ");
            System.out.println("1-Yeni kayit : ");
            System.out.println("2-Kayit sil  :");
            System.out.println("3-Kayitlari listele :  ");
            System.out.println("4-En basarili ogrenci bilgileri ");
            System.out.println("0-Cikis");
    
            secim = scan.nextInt();
            
            if(secim ==1 ){
                bilBolum.ekle();   
            }
            else if (secim == 2) {
                bilBolum.sil();
            }else if (secim == 3){
                bilBolum.yazdir();
            }else if (secim==4){
                bilBolum.enBasariliOgrenci();
            }else if (secim == 0 ){
                System.out.print("programi sonlandirdiniz ...");
                return;
            }
            else {
                System.out.println("Hatali yada eksik tuslama yaptiniz ([0-4] arasi secim yapiniz ) .");
            }
            
            
        }
        
    }
    
}
