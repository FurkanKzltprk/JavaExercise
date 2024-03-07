
import java.util.Scanner;

public class ebobBulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ebob = 0;
        System.out.print("1.Sayıyı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("2.sayıyı giriniz : ");
        int sayi2 = scan.nextInt();

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;

            }

        }
        System.out.println("Ebob = "+ebob);

    }

}
