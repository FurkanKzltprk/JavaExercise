
import java.util.Scanner;


public class sayınınRakamKareAlma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, number;

        System.out.println("enter a number  :");
        int sayi = scan.nextInt();

        while (sayi > 0) {
            number = sayi % 10;
            System.out.println(number + " ın karesi " + (number * number));
            sum += (number * number);
            sayi /= 10;

        }
        System.out.println("Girilen sayinin karelerinin toplamı  = " + sum);

    }
}
