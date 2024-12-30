package AlgoDersKalitim;
// ilhan hoca yazdırdı ↓↓
//                kurucu ziniciri 
//  bir kurucu metod aşırı yüklenmiş başka bir kurucu metodu 
//  veya üst sınıfın kurucu metodunu çağırabilir 
// eğer açıklça çağırım yapılmazsa derleyici önce üst sınıfın 
// kurucu metodunu çağırır , üst sınıfta kendi kurucu metodunu 
// çalıştırmadan bir üst sınıfın kurucusunu çağırır 
// Bu en üst sınıftaki kurucu metod çağırılıncaya kadar devam eder.

// en üstte kişi onu extend eden işçi onu da extend eden memur olsun
// böyle bir yapıda her birinin kurucu metodu var. bunu gösteriniz 
// Hiyerarşik bir kalıtım örneği. ↓↓↓

// kisi 
// ↑
// isci
// ↑ 
// memur
class kisi {

    int x;

    public kisi(int x) {
        this.x = x;
        System.out.println("1-Kisinin gorevleri");
    }

    void gosterx() {
        System.out.println("X = " + x);
    }

}

class isci extends kisi {

    int y;

    public isci(int x, int y) {

        super(x);
        this.y = y;
        System.out.println("2-iscinin gorevleri");
    }

    void gosterxy() {
        super.gosterx();
        System.out.println("y = " + y);
    }
}

public class Memur extends isci {

    int z;

    public Memur(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("3-Memurun gorevleri");
    }

    void gosterxyz() {
        gosterxy();
        System.out.println("Z = " + z);
    }

    public static void main(String[] args) {
        Memur m = new Memur(2, 3, 5);
        m.gosterxyz();

    }

}
