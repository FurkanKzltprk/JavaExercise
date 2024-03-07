
import java.util.Scanner;


public class findAvarege {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sum = 0;
        
        System.out.println("How many items do you want to enter? ");
        
        int item = scan.nextInt();
        
        for (int i = 0; i < item; i++) {
            System.out.println("enter the "+(i+1)+".rd number");
            num=scan.nextInt(); 
            sum+=num;
            
        }
        System.out.println("sum of numbers" + ((float)sum/item));
        
    }
    
}
