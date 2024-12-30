
import java.util.Scanner;


public class icibosKare{
    public static void main (String [] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunluğunu giriniz : ");
        int kenarUzunlugu = scan.nextInt();
        
        for (int i = 1; i <=kenarUzunlugu; i++) {
            for (int j = 1; j <=kenarUzunlugu; j++) {
                if (i==1 || j ==1 || i == kenarUzunlugu|| j == kenarUzunlugu) {
                    System.out.print("* ");
                    
                }
                else {
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println();
            
        }
        
    }
    
    
}