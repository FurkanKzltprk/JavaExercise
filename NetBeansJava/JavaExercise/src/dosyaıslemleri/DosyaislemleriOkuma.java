
package dosyaıslemleri;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class DosyaislemleriOkuma {
    public static void main(String[] args) {
    try(Scanner scan = new Scanner(new FileReader("kullanicilar.txt"))){
      
        while(scan.hasNextLine()){    //programın içerisindeki tüm değerleri ekrana yazdırdı.
            System.out.println(scan.nextLine());
        }
        System.out.println("Dongu bitti");
        
        
    }   catch (FileNotFoundException ex) {   
        System.out.println("Dosya bulunamadi");
        } catch (IOException ex) {
            System.out.println("Okunurken bir hata olustu.");
        }   
    }
    
}
