package stack;

public class StackYigin {

    int dizi[];
    int size;
    int indis;

    public StackYigin(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;

    }

    void push(int data) {

        if (isFull()) {

            System.out.println("stack dolu");
        } else {
            indis++;
            dizi[indis] = data;
            System.out.println("push() : " + dizi[indis]);

        }
    }

    int pop() {
        if (!isEmpty()) {
            return dizi[indis--];

        } else {
            System.out.println("dizi bos !");
            return -1;
        }

    }

    boolean isFull() {
        return (indis == size - 1);
    }

    boolean isEmpty() {
        return (indis == -1);
    }

}
