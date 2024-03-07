
import java.util.Scanner;


public class onkisiIsımSoyisimal {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        String [] isimler = new String [10];
        String [] soyisimler = new String [10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".Kişinin Adı : ");
            isimler[i] = scan.nextLine();
            System.out.println((i+1)+".Kişinin Soyadı : ");
            soyisimler[i]=scan.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".Kişi "+ isimler[i]+" "+soyisimler[i]);
        }
         
       
    }
    
}
