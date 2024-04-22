
package calismaBireysel;

public class Araba {
    private int km,yıl;
    public int maksHız;
    public String marka;
    
    
    public Araba() {
    this.km = 14567;
    this.marka="mercedes";
    this.yıl=2021;
    this.maksHız=220;
}
    public void yaz (){
        System.out.println(maksHız);
        System.out.println(marka);
        System.out.println(yıl);
        System.out.println(km);
    }
}
