package queue_yapisi;

public class Uygulama {

    public static void main(String[] args) {
        QueueYapisi kuyruk = new QueueYapisi(5);

        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        kuyruk.deQueue();
        kuyruk.DiziYazdir();
        
        kuyruk.yazdir();
    }

}
