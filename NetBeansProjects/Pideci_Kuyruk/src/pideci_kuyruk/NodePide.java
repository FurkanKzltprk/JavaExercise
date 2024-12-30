package pideci_kuyruk;

public class NodePide {

    String isim;
    int adet;
    int ucret;
    NodePide next;

    public NodePide(String isim, int adet) {
        this.isim = isim;
        this.adet = adet;
        ucret = adet * 4;
        next =null;
    }

}
