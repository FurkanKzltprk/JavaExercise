package hash_ders;

public class Tablo {

    Node[] dizi;
    int size;

    public Tablo(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();

        }

    }

    int indexUret(int key) {
        return key % size;

    }

    void ekle(int key, String isim) {

        int index = indexUret(key);

        Node eleman = new Node(key, isim);

        Node temp = dizi[index];

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = eleman;

        System.out.println(eleman.isim + " eklendi");

    }
}
