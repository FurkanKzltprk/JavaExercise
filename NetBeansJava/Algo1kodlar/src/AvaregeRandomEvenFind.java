
import java.util.Random;

public class AvaregeRandomEvenFind {

    public static void main(String[] args) {

        Random rndm = new Random();

        int number, sum = 0;

        for (int i = 0; i < 10; i++) {

            number = 5 + rndm.nextInt(145);
            if (number % 2 == 0) {
                System.out.println("Even number : " + number);
                sum += number;

            } else {
                System.out.println(number);
            }

        }
        System.out.println("Sum of even numbers : " + sum);

    }

}
