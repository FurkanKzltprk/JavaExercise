package abstarctsiniflar;

public abstract class Kullanici {

    public void girisYap(String kullaniciAdi, String sifre) {
        if (kullaniciAdi.equals("Admin") && sifre.equals("asd0123")) {
            System.out.println("Giris basarili");

        } else {
            System.out.println("giris basarisiz");
        }

    }

    abstract void kayitOl(); // neden süslü parantez kullanılmadı?
                            //  abstactlar asla new lenemez kullanıcı  =new kullanıcı gibi .
    
}
