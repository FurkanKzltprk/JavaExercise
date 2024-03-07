
import java.util.Scanner;


public class sayıyıTerstenYazma {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz : ");
        
        int sayi = scan.nextInt();
        
        System.out.print("Girdiğiniz sayının tersten yazılışı = ");
        
        while(sayi  > 0){
            
            System.out.print(sayi%10);
            
            sayi/=10;
        }
            
        
    }
    
    
    
}
