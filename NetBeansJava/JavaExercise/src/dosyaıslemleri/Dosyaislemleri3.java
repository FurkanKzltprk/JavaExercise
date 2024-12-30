package dosyaıslemleri;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dosyaislemleri3 {

    public static void main(String[] args) {
//        FileWriter writer = null;
//
//        try {
//            writer = new FileWriter("Dosya.txt", true);
//
//            writer.write("Furkanke\n");
//
//        } catch (IOException ex) {
//            System.out.println("Dosya olusturulurken bir hata oldu.");
//
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException ex) {
//                    System.out.println("Dosya kapatilirken bir haya olustu.");
//                }
//
//            }
//
//        }

// java 7 ile gelen yeni özelligi kullanıyoruz oto. bir şekilde kapatıyor dosyayı 
        
            try(FileWriter writer = new FileWriter("Dosya2.txt");
                    FileWriter writer2 = new FileWriter("Dosya3.txt")){
                writer.write("Furkan kiziltoprak\n");
                writer.write("Omer faruk bulut\n");
                writer2.write("45622\n");
            }catch (IOException ex){
                System.out.println("dosya olusturulurken bir haya olustu.");
            }
        
    }
}
