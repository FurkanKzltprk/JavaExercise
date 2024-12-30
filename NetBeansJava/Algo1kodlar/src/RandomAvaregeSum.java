
import java.util.Random;


public class RandomAvaregeSum {
    public static void main (String [] args){
        Random rndm = new Random();
        int number;
        float sum =0;
        
        for (int i = 0; i < 10; i++) {
            
            number = 50 + rndm.nextInt(50);
            System.out.print(" "+number+" ");
            sum +=number;
            
        }
        System.out.println("Avarege of numbers:  "+ (sum/10));
            
        
    }
    
}
