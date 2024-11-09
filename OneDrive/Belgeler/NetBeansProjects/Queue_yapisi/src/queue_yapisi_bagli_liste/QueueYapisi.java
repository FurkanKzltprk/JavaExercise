package queue_yapisi_bagli_liste;

public class QueueYapisi {

    Node front; //head
    Node rear;  //tail  
    int cnt;    //counter (sayıcı)
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println(" Kuyruk dolu ekleme yapilamadi");
        } else {
            Node eleman = new Node(data);

            if (isEmpty()) {
                front = rear = eleman;
                System.out.println(data + " Kuyruga ilk eleman olarak eklendi");
            } else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " Kuyruga eklendi");
            }
            cnt++;
        }

    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println(" Kuyruk bos silinecek bir sey yok ");
        } else {
            System.out.println(front.data + " silindi");

            front = front.next;
            cnt--;

        }

    }

    private boolean isFull() {
        return cnt == size;
    }

    private boolean isEmpty() {
        return cnt == 0;
    }

    void print() {
        if (isEmpty()) {
            System.out.println(" kuyruk bos yazdirilacak eleman yok");
        } else {

            Node temp = front;
            System.out.print("bas <-");

            while (temp != null) {
                System.out.print(temp.data + "<-");
                temp = temp.next;
            }
            System.out.println("son");
        }
    }

}
