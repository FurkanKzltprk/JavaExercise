package pideci_kuyruk;

import java.util.Scanner;

public class Uygulama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secim = -1;
        int n;

        System.out.println("kuyruk yapisinin eleman sayisi : ");
        n = scan.nextInt();

        QueuePideYapisi kuyruk = new QueuePideYapisi(n);

        while (secim != 0) {
            System.out.println("1-Yeni musteri ekle : ");
            System.out.println("2-Satis Yap: ");
            System.out.println("3-Bekleyen musterileri : ");
            System.out.println("4-Toplam gelir : ");
            System.out.println("0-cikis : ");
            System.out.println("Seciminiz : ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    kuyruk.enQueue();
                    break;
                case 2:
                    kuyruk.deQueue();
                    break;
                case 3:
                    kuyruk.print();
                    break;
                case 4:
                    System.out.println("toplam gelir :" + kuyruk.toplamGelir);
                    break;
                case 0:
                    System.out.println("cikis yaptiniz ");
                    break;
                default:
                    System.out.println("Hatali islem yaptiniz ");
                    break;

            }

        }

    }
}
