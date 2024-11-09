package queue_yapisi;

public class QueueYapisi {

    int[] dizi;
    int size;
    int front;
    int rear;

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int data) {
        if (isFull()) {

            System.out.println("kuyruk dolu , ekleme yapamazsiniz ");
        } else {

            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + " kuyruga eklendi.");
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("kuyruk bos,silinecek eleman yok ");

        }

        int sayi = dizi[front];
        for (int i = 1; i <= rear; i++) {
            dizi[i - 1] = dizi[i];

        }
        rear--;
        System.out.println(sayi + " kuyruktan cikarildi ");

    }

    private boolean isFull() {
        return rear == size - 1;
    }

    private boolean isEmpty() {
        return rear == -1;

    }

    void elemanSayisi() {
        System.out.println("eleman sayisi : " + (rear + 1));
    }

    void DiziYazdir() {
        for (int i = 0; i < size; i++) {
            System.out.print(dizi[i] + "->");

        }
    }

    void yazdir() {
        int i = rear;
        System.out.print("son ->");
        while (i >= 0) {
            System.out.print(dizi[i] + "->");
            i--;
        }
        System.out.println("bas");
    }

}
