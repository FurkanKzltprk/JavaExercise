
package HayvanatBahcesi1;


public class Koyun extends Hayvan {
    public String renk;
    
    public void kırp(){
        System.out.println("yunleri kirpiliyor.");
    }

    @Override
    public void yemekVer() {
        System.out.println("Ot verildi.");
    }
    
    

    
}
