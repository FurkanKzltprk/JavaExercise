package cift_yonlu_liste;

public class BagliListe {

    Node head = null;
    Node tail = null;

    void basaEkle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;

        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }

    }

    void sonaEkle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;

        } else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

    void yazdir() {
        Node temp = head;
        System.out.print("bas ->");
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("-> son.");
    }

    void sondanYazdir() {

        Node temp = tail;
        System.out.print("son ->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;

        }
        System.out.print("bas");
    }

    void arayaEkleme(int indis, int data) {
        Node eleman = new Node(data);
        
        if (head == null) {
            head = eleman;
            tail = eleman;

        } else if (head != null && indis == 0) {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
//       Başa eleman ekleme     
        } else {
            int n = 0;
            Node temp = head;

            while (temp != null) {
                temp = temp.next;
                n++;
            }
            temp = head;  //tekrar tanımladık tempi yukarıda n i bulmak için 
                          //değiştirmiştik.
            if (indis >= n) {
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;

            } else {
                
                int i = 0;

                while (i != indis) {
                    temp = temp.next;
                    i++;
                }

                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                eleman.next = temp;
                temp.prev = eleman;

            }
        }

    }
}
