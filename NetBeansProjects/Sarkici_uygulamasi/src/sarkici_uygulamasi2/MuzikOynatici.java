package sarkici_uygulamasi2;

public class MuzikOynatici {

    SarkiDugum ilksarki;
    SarkiDugum mevcutsarki;

    void SarkiEkle(String sarkiad) {
        SarkiDugum yeniSarki = new SarkiDugum(sarkiad);

        if (ilksarki == null) { // sarki listesi bos ise
            ilksarki = yeniSarki;
            mevcutsarki = yeniSarki;
            System.out.println("ilk sarki eklendi  : " + yeniSarki.sarkiad);

        } else { //listede sarki varsa listeye sondan eklicez

            SarkiDugum gecici = ilksarki;

            while (gecici.sonrakiSarki != null) {
                gecici = gecici.sonrakiSarki;
            }
            gecici.sonrakiSarki = yeniSarki;
            yeniSarki.oncekisarki = gecici;
            System.out.println("listeye eklendi : " + yeniSarki.sarkiad);

        }

    }
    
    void SarkiSil(){
        
    }

    void mevcutSarkiOynat() {
        if (mevcutsarki != null) {
            System.out.println("Suan oynatilan sarki : " + mevcutsarki.sarkiad);
        } else {
            System.out.println("Calma listesi bos sarki oynatilamiyor .");
        }

    }

    void sonrakiSarki() {

        if (mevcutsarki != null && mevcutsarki.sonrakiSarki != null) {
            mevcutsarki = mevcutsarki.sonrakiSarki;
            mevcutSarkiOynat();

        } else {
            System.out.println("sonraki sarki bulunamadi.");
        }
    }
    
    void oncekiSarki(){
        if(mevcutsarki != null && mevcutsarki.oncekisarki != null){
            mevcutsarki = mevcutsarki.oncekisarki;
            mevcutSarkiOynat();
        }else {
            System.out.println("Onceki sarki bulunamadi.");
        }
        
    }

    void listeninBasinaAl() {
        mevcutsarki = ilksarki;
        mevcutSarkiOynat();
    }

    void sarkilariListele() {

        SarkiDugum temp = ilksarki;
        int i = 1;
        System.out.println("-------------------------");
        while (temp != null) {
            System.out.println(i + ".sarki  : " + temp.sarkiad);
            temp = temp.sonrakiSarki;
            i++;
        }
        System.out.println("-------------------------");

    }

}
