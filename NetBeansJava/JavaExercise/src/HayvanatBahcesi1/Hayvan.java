package HayvanatBahcesi1;

public class Hayvan {

    public int id;
    public String isim;
    public int yas;

    public void suVer() {
        System.out.println("Su verilidi.");

    }
    public void asiYap(){
        System.out.println("Asi yapildi.");
    }
    public void temizle(){
        System.out.println("Hayvan temizlendi.");
    }
    public void besle(String yemek ){
        System.out.println("Hayvan beslendi: "+yemek+" yedi.");
        
    } 
    public void yemekVer(){
        System.out.println("Yemek verildi.");
    }
    

}
