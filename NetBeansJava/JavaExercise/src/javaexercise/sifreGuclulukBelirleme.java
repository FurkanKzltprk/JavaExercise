
package javaexercise;

import java.util.Scanner;


public class sifreGuclulukBelirleme {

   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrenizi belirleyiniz : ");
        String sifre = scan.nextLine();
        boolean ozelMi =false;
        
        for (int i = 0; i < sifre.length(); i++) {
            char karakter = sifre.charAt(i);
            ozelMi = false;
            if (ozelKarakterMİ(karakter)) {//karakter özel karakter mi?
                ozelMi= true;
                break;
                
            }
            
        }
        if (ozelMi) {
            System.out.println("Özel karakter vardır.");
            
        }
        else{
            System.out.println("Özel karakter yoktur.");
            
        }
        int gucluluk = guclulukDerecesi(sifre);
        System.out.println("Güçlülük derecesi :"+gucluluk);
        System.out.println(gucluluk/25+ "/4");
        
        
        
           
        
    }
    public static boolean ozelKarakterMİ(char karakter ){
        
        String ozelKarakterler ="!@#$%*&+";
        boolean ozelkarakterMi = false;
        
        for (int i = 0; i < ozelKarakterler.length(); i++) {
            if (ozelKarakterler.charAt(i) == karakter) {
                ozelkarakterMi= true;
                break;
                
            }
            
        }
        return ozelkarakterMi;
        
    }
    public static int guclulukDerecesi(String sifre){
        
        int rakam = 0,kucukHarf = 0, buyukHarf = 0,ozelkarakter=0;
        
        for (int i = 0; i < sifre.length(); i++) {
            char karakter =sifre.charAt(i); 
            
            if (48 <= (int) karakter && (int) karakter <= 57) {
                rakam = 25;
                
                
            }
            if (65 <= (int) karakter && (int) karakter <= 90) {
                buyukHarf = 25;
                
                
            }
            if (97 <= (int) karakter && (int) karakter <= 122) {
                kucukHarf= 25;
                
                
            }
            if (ozelKarakterMİ(karakter)) {
                ozelkarakter = 25;
                
            }
            
            
        }
            int gucluluk = rakam + buyukHarf + kucukHarf + ozelkarakter;
            return gucluluk;
        
    }
    
    
    
}
