package queue_yapisi_bagli_liste;

public class Uygulama {

    public static void main(String[] args) {
        QueueYapisi kuyruk = new QueueYapisi(5);

        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        kuyruk.enQueue(60);        
        kuyruk.print();
        kuyruk.deQueue();
        kuyruk.print();

    }

}
