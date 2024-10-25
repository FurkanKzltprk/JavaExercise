package ListeYapisi;


import java.util.Scanner;

public class veri_yapilari {

    class Dugum {

        int sayi;
        Dugum ileri;

//       constructor bir sınıf değil bundan dolayı 'class' eklemene gerek yok 
//       ama constructor public olmalı  her yerden erişilebilir .
        public Dugum(int sayi) { //neden parametre aldı ? 
            this.sayi = sayi;
            this.ileri = null;

        }
    }

    class Bliste {

        Dugum bas, son;

        void basaEkle(Dugum yeni) {

            if (bas == null) {
                bas = yeni;
                son = yeni;

            } else {
                yeni.ileri = bas;
                bas = yeni;
            }

        }

        void sonaEkle(Dugum yeni) {
            if (son == null) {
                son = yeni;
                bas = yeni;

            } else {
                son.ileri = yeni;
                son = yeni;
            }

        }

        void arayaEkle(int indis, Dugum yeni) {
            if (indis < 0) {
                System.out.println("Geçersiz indeks.");
                return; // Geçersiz indeks durumu
            }

            if (indis == 0) {
                // Eğer indeks 0 ise, yeni elemanı başa ekleriz
                basaEkle(yeni);
                return;
            }

            Dugum temp = bas;
            int sayac = 0;

            // İlgili indekse kadar gidiyoruz
            while (temp != null && sayac < indis - 1) {
                temp = temp.ileri;
                sayac++;
            }

            if (temp == null) {
                System.out.println("Veri yapısında yeterli eleman yok. Eleman eklenemedi.");
            } else {
                // Yeni düğümün ileri referansını mevcut düğümün ileri referansına ayarlıyoruz
                yeni.ileri = temp.ileri;
                temp.ileri = yeni; // Geçerli düğümün ileri referansını yeni düğüme ayarlıyoruz
            }
        }

        void bastanSil() {
            Dugum silinen;

            if (bas != null) {
                silinen = bas;
                System.out.println(silinen + " silindi.");
                bas = bas.ileri;
                if (bas == null) {
                    son = null;

                }
                System.out.println("Liste boş");

            } else {
                System.out.print("Liste zaten bos");
            }

        }

        void sondanSil() {
    if (son == null) {
        System.out.println("Liste zaten boş.");
        return; // Liste boşsa, hiçbir şey yapmıyoruz
    }
    
    // Eğer liste sadece bir düğüm içeriyorsa
    if (bas == son) {
        System.out.println(son.sayi + " silindi.");
        bas = null; // Listeyi boşaltıyoruz
        son = null; // Son referansını da null yapıyoruz
    } else {
        // Liste iki veya daha fazla düğüm içeriyorsa
        Dugum temp = bas;
        
        // Son düğümden önceki düğümü bulmak için döngü
        while (temp.ileri != son) {
            temp = temp.ileri;
        }

        // Son düğümün silinmesi
        System.out.println(son.sayi + " silindi.");
        temp.ileri = null; // Önceki düğümün ileri referansını null yapıyoruz
        son = temp; // Son referansını önceki düğüme ayarlıyoruz
    }
}
         void aradanSil(int indis) {
            if (indis < 0) {
                System.out.println("Geçersiz indeks.");
                return; // Geçersiz indeks durumu
            }

            // Eğer silinecek düğüm ilk düğümse, baştan sil
            if (indis == 0) {
                bastanSil();
                return;
            }

            Dugum temp = bas;
            Dugum once = null;
            int sayac = 0;

            // İlgili indekse kadar gidiyoruz
            while (temp != null && sayac < indis) {
                once = temp;
                temp = temp.ileri;
                sayac++;
            }

            // Eğer temp null ise, belirtilen indeks geçersizdir
            if (temp == null) {
                System.out.println("Liste de yeterli eleman yok. Silme işlemi yapılamadı.");
                return; // Geçersiz indeks durumu
            }

            // Silinecek düğümün öncesindeki düğümün ileri referansını güncelle
            once.ileri = temp.ileri;

            // Eğer silinen düğüm son düğümse, son referansını güncelle
            if (temp == son) {
                son = once;
            }

            System.out.println(temp.sayi + " silindi."); // Silinen elemanın bilgisini yazdır
        }

        

        void listele() {
            Dugum temp = bas;

            while (temp != null) {

                System.out.print(temp.sayi + " -> ");
                temp = temp.ileri;
//                temp.ileri = temp;  sonsuz döngüye girer.

            }
            System.out.println("null ");

        }

    }

    public static void main(String[] args) {
        veri_yapilari calistir = new veri_yapilari();
        Bliste bliste = calistir.new Bliste();

        int secim = 1;
        int sayi, indis;
        Scanner scan = new Scanner(System.in);
        while (secim != 0) {
            
            System.out.println("1 basa ekle ");
            System.out.println("2 sona ekle ");
            System.out.println("3 araya ekle ");
            System.out.println("4 bastan sil ");
            System.out.println("5 sondan sil ");
            System.out.println("6 aradan sil ");
            System.out.println("7 Listele");
            System.out.println("0 cikis ");
            System.out.println("seçiminiz : ");
            secim = scan.nextInt();

            if (secim == 1) {
                System.out.println("basa eklemek istediginiz sayi  :");
                sayi = scan.nextInt();
                bliste.basaEkle(calistir.new Dugum(sayi));

            }
            if (secim == 2) {
                System.out.println("sona eklemek istediginiz sayi  :");
                sayi = scan.nextInt();
                bliste.sonaEkle(calistir.new Dugum(sayi));

            }
            if (secim == 3) {
                System.out.println("Eklemek istediginiz indisi giriniz : ");
                indis = scan.nextInt();
                System.out.println("araya eklemek istediginiz sayi  :");
                sayi = scan.nextInt();
                bliste.arayaEkle(indis, calistir.new Dugum(sayi));

            }
            if(secim == 4 ){
                
                System.out.println("Bastan eleman silindi .");
                bliste.bastanSil();
            }
            if(secim == 5){
                System.out.println("Sondan eleman silindi.");
                bliste.sondanSil();
            }
            if(secim == 6){
                System.out.println("kacinci indisi silmek istiyorusunuz : ");
                indis = scan.nextInt();
                bliste.aradanSil(indis);
                
                
            }
            if(secim == 7){
                bliste.listele();
            }
            if(secim == 0){
                System.out.println("program sonlandi.");
                return;
            }

        }

//        bliste.basaEkle(calistir.new Dugum(15));
//        bliste.basaEkle(calistir.new Dugum(25));
//        bliste.basaEkle(calistir.new Dugum(35));
//        bliste.sonaEkle(scalistir.new Dugum(11));
//        bliste.arayaEkle(2, calistir.new Dugum(22));
//        bliste.sondanSil();;
//        bliste.bastanSil();
//
//        bliste.listele();
    }

}
