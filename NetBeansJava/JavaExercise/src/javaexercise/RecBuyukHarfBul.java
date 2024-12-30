
package javaexercise;

import java.util.Scanner;


public class RecBuyukHarfBul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelimeyi gir :");
        String kelime = scan.nextLine();
        int buyukHarfsayisi = buyukHarfSayisiniBul(kelime);
        System.out.println("Girilenn stringteki buyuk harf sayisi : "+ buyukHarfsayisi);
        
    }
    
    public static int buyukHarfSayisiniBul(String str){
        //rekürsif metodu burada tanımlıyoruz.
        
        if(str.length() == 0){
            return 0;
        }else{
            char karakter = str.charAt(0);  /*0.karakteri kontrol etti , substring kullanarak 
                                            !geri kalan stringin 0. indisini kontrol  ettirdi
                                             bu durumda rekürsifle döngüye girmiş gibi oldu */
                                            
            if(Character.isUpperCase(karakter)){
                return 1+buyukHarfSayisiniBul(str.substring(1));
            }else{
                return 0+buyukHarfSayisiniBul(str.substring(1));
            }
            
        }
        
    }
    
    
    
}
