
package AlgoDersKalitim;

class arac{
    int makshiz = 120;
}
class araba extends arac{
    int makshiz = 260;
    void goster(){
        System.out.println("ust sinif hiz : " +super.makshiz);
        System.out.println("Mevcut sinif hiz : " + makshiz);
    }
}


public class Kalitim2 {
    
}
