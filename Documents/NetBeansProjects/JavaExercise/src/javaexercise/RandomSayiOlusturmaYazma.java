package javaexercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class RandomSayiOlusturmaYazma {

    //rastgele girilen karakterleri alıp dosyaya yazacak.
    
    public static void main(String[] args) {
        
        PrintWriter p = null;
        File dosya = new File ("sayilar.txt");
        
        try {
            if(!dosya.exists()){
                dosya.createNewFile();
                
            }else{
                System.out.println("Dosya mevcut");
            }
            p = new PrintWriter(new FileOutputStream(dosya,false));
            for (int i = 0; i < 100; i++) {
                int sayi = (int) (Math.random()*400);
                p.println(sayi);
                
            }
            p.close();
            
        } catch (Exception e) {
            System.out.println("Istisna olustu : "+ e.getMessage());
        }
        
        
        
    }
}
