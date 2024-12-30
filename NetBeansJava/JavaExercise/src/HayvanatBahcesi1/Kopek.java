
package HayvanatBahcesi1;


public class Kopek extends Hayvan{
    
    public int disSayisi;
    
    public void yuryusYap(){
        System.out.println("Yürüyüs yapıldı.");
    }
    public void egitimVer(){
        System.out.println("Egitim verildi.");
    }

    @Override
    public void asiYap() {
        System.out.println("kuduz asisi yapildi");
    }

    @Override
    public void yemekVer() {
        System.out.println("Et verildi.");
    }
    
    
    
    
}
