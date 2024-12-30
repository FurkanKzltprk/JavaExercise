package pideci_kuyruk;

import java.util.Scanner;

public class QueuePideYapisi {

    Scanner scan = new Scanner(System.in);

    NodePide front, rear;
    int size, cnt;

    public QueuePideYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }
    int toplamGelir = 0;
    String isim;
    int adet;

    void enQueue() {
        if (isFull()) {
            System.out.println("Kuyruk sirasi dolu ");
        } else {

            System.out.println("musteri ismi : ");
            isim = scan.nextLine();
            System.out.println("Pide sayisi  : ");
            adet = scan.nextInt();
            scan.nextLine();
            NodePide eleman = new NodePide(isim, adet);
            if (isEmpty()) {
                front = rear = eleman;
                System.out.println("Kuyruk yapisi olusturuldu ilk musteri siraya girdi .");

            } else {
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim + " siraya girdi");
            }
            cnt++;
        }

    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("pide sirasinda bekleyen musteri yok !");
            System.out.println("");
        } else {
            toplamGelir += front.ucret;
            System.out.println(front.isim + "   " + front.adet + " adet pidesini aldi, toplam borcu " + front.ucret + " Tl");
            front = front.next;
            cnt--;
        }

    }

    void print() {

        if (isEmpty()) {
            System.out.print("Bekleyen musteri yok");
        } else {
            NodePide temp = front;
            System.out.print("bas <-");
            while (temp != null) {
                System.out.print(temp.isim + "<-");
                temp = temp.next;

            }
            System.out.println("son");
        }
    }

    boolean isEmpty() {
        return cnt == 0;

    }

    boolean isFull() {
        return cnt == size;
    }
}
