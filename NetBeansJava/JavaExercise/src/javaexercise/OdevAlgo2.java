
package javaexercise;

import java.util.Random;


public class OdevAlgo2 {

    public static void main(String[] args) {
        int [][] IscılerVeGunler = new int [20][5];
        int [] maaslar = new int [20];
        int SaatlikUcret = 500 ;
        
        
        Random rastgele = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                IscılerVeGunler[i][j] = rastgele.nextInt(12)+1;
            }
        }
        
        for (int i = 0; i < 20; i++) {
            int toplamCalismaSuresi= 0;
            for (int j = 0; j < 5; j++) {
                toplamCalismaSuresi = toplamCalismaSuresi + IscılerVeGunler[i][j];
                
            }
            maaslar[i]= toplamCalismaSuresi * SaatlikUcret;
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println((i+1)+" .iscinin maasi : "+ maaslar[i]);
        }
        
        
        
    }
}
