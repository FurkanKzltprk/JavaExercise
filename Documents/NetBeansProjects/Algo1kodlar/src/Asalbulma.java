
public class Asalbulma{

    static void Asallar(int sayi1, int sayi2) {
        int sayac;
        for (int i = sayi1; i < sayi2; i++) {
            sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println("Asal sayi = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Asallar(2, 25);
    }
}
