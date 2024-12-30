package dosyaıslemleri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DosyaIslemleri {

    // veri yazmayı öğreneceğiz kullancağımız clas FileOutputStream.
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Dosya.txt" , false); // unreported exception.
            
            
            
//            fileOutputStream.write(90);
//            fileOutputStream.write(75);
//            
//            
//            byte []  dizi = {66,65,66,65}; //BABA yazdık
//            fileOutputStream.write(dizi);
            
            String isim ="Furkan kiziltoprak";
            byte [] isimDizi =isim.getBytes();
            fileOutputStream.write(isimDizi);
            
        } catch (FileNotFoundException ex) {

            System.out.println("Dosya bulunamadı.");

        } catch (IOException ex) {
            System.out.println("Dosyaya yazilirken bir hata olustu.");
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();

                }

            } catch (IOException ex) {
                System.out.println("Dosya kapatilirken bir hata olustu.");
            }
        }

    }

}
