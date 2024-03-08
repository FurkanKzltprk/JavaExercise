
package javaexercise;

import java.util.Scanner;


public class sesliSil {

    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz : ");
        String metin = scan.nextLine();
        
        String sessizHarfsizMetin = sesliSil(metin);
        System.out.println("Sessiz harfsiz metin : " +sessizHarfsizMetin);
        
        
    }
    public static String sesliSil(String metin){
        String sonuc ="";
        String sesliHarfler = "aeiuoAEİUO";
        
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            boolean sesliHarfvarMi=false;
            for (int j = 0; j < sesliHarfler.length(); j++) {
                if (karakter == sesliHarfler.charAt(j)) {
                    sesliHarfvarMi=true;
                    break;
                    
                    
                }
                
            }
            if (!sesliHarfvarMi) {
                sonuc = sonuc + karakter;
                
            }
            
        }
        return sonuc;
        
    }
}
