package HayvanatBahcesi1;

public class At extends Hayvan {

    public At() {
    }
    public double bacakBoyu;
    public int maxHız;

    public void naldegis() {
        System.out.println("Nal değisti.");

    }

    public void egitimVer() {
        System.out.println("Egitim verildi.");
 
    }

    @Override
    public void asiYap() {
        super.asiYap();
        System.out.println("Kudz asısı da yapıldı.");
    }

    @Override
    public void yemekVer() {
        System.out.println("Yulaf verildi.");
    }

}
