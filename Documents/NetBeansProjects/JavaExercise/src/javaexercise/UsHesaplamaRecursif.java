
package javaexercise;

import java.util.Scanner;


public class UsHesaplamaRecursif {
    public static int usHesaplama (int taban , int us  ){
        if (us == 0) {
            return 1;
            
        }else{
            return taban * usHesaplama(taban, us-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban degerini giriniz :");
        int taban = scan.nextInt();
        System.out.println("Us degerini giriniz :");
        int us = scan.nextInt();
        System.out.println("sonuc :"+usHesaplama(taban, us));
    }
    
}
