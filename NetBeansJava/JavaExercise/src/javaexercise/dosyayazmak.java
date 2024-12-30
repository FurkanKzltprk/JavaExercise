
package javaexercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dosyayazmak {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null; 
        try {
             fileOutputStream = new FileOutputStream("Dosyalarım.txt");
             
             String isim = "Furkan";
             byte[] isimDizi = isim.getBytes();
             fileOutputStream.write(isimDizi);
             
             
             
             
             
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException ex){
            System.out.println("Dosya yazilirken bir hata olustu.");
        }
        
        finally{
            try{
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    
                }
            }   catch ( IOException ex){
                System.out.println("Dosya kapatılırken bir hata olustu.");
            }
        }
        
    }
    
}
