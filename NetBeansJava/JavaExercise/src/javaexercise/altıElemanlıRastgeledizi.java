
package javaexercise;

import java.util.Random;

public class altıElemanlıRastgeledizi {
   
    static Random rastgele = new Random();
    

    public static void main(String args[]) {
        
        int sayi1 = rastgele.nextInt(10)+1;
        int sayi2 = rastgele.nextInt(50)+50;
        System.out.println("Rastgele oluşan 1. sayı : "+sayi1);
        System.out.println("Rastgele oluşan 2. sayı : "+sayi2);
        
        int enBüyük = maxBul(diziOlustur(sayi1, sayi2));
        System.out.println("Rastgele olusturulan 6 elemanli dizideki en buyuk deger : "+ enBüyük);
        
        
        
        
    }public static int[] diziOlustur(int sayi1 , int sayi2){
        int[] dizi = new int [6];
            System.out.println("Dizi oluşturuluyor...");
            for (int i = 0; i < dizi.length; i++) {
                dizi[i] =rastgele.nextInt(sayi2-sayi1)+sayi1;
                System.out.println(dizi[i]+" ");
                
                
            }
            System.out.println();
            return dizi;
    }
    public static int maxBul(int [] dizi){
        int enBuyuk = dizi[0];
        
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enBuyuk) {
                enBuyuk = dizi[i];
                
                
            }
            
        }
        return enBuyuk;
        
        
         
        
        
    }
    
   
}
