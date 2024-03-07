
import java.util.Scanner;

public class eksi1girenekadarTopla {

    public static void main(String[] args) {
        int top = 0;
        Scanner scan = new Scanner(System.in);
System.out.println("toplama işlemini bitirmek için -1 e bas");
        while (true) {
            
            int sayi = scan.nextInt();  
            
            if (sayi< 0) {
                break;
                
            }
            top = top+sayi;
            
        }
        System.out.println("top sayı : "+ top);
    }

}
