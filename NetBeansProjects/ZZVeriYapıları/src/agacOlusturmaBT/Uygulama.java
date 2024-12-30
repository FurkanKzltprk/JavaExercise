package agacOlusturmaBT;

public class Uygulama {

    public static void main(String[] args) {
        BTree bt = new BTree();

        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 20);
        bt.root = bt.insert(bt.root, 4);
        bt.root = bt.insert(bt.root, 12);

        System.out.println(" kokün datası : " + bt.root.data);
        System.out.println(" kokün sağındaki datası : " + bt.root.right.data);
        System.out.println(" kokün solundaki datası : " + bt.root.left.data);
        System.out.println(" kokün solunun solunun datası : " + bt.root.left.left.data);
        System.out.println(" kokün saginin sagi : " + bt.root.right.right.data);
        System.out.println(" kokun saginin solu : " + bt.root.right.left.data);

    }

}
