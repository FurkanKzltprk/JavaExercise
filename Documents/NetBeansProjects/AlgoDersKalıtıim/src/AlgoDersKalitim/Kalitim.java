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






class toplama {

    int x;
    private int c;

    int topla(int y) {
        return y;

    }
   // Altgr = ctrl + alt.
}
// hocanın derstte verdiği örnek .
// extends etmesi demek miras alması demektir.

class carp extends toplama {

    int carp(int a, int b) {
        //   c = 8;  // private old. için izin vermiyor hata veriyor.
        for (int i = 0; i < b; i++) {
            x += super.topla(a);

        }
        return x;
    }

}

public class Kalitim {

    public static void main(String[] args) {
        carp c = new carp();   // toplama islemi yapildi kalıtım kullanılarak.
        int t = c.carp(2, 4);
        System.out.println("t = " + t);
    }
}
