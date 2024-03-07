
package algoritmakodcalismalari;

import java.util.Scanner;

public class IciBosKare {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Karenin kenar uzunluğunu giriniz:");
            int kenarUzunluğu = scan.nextInt();
            
            for(int i = 1 ; i <= kenarUzunluğu ; i++){
                for(int j = 1 ; j<= kenarUzunluğu; j++){
                    if(i==1|| j==1|| i==kenarUzunluğu || j == kenarUzunluğu){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
            
            
    }

    
}
