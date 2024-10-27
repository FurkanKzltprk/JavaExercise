package ogrenci.kayit.uygulamasi;

import java.util.Scanner;

public class OgrListe {

    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;

    Scanner scan = new Scanner(System.in);

    // bir öğrenci eklemek için gerekli olan kodlar.
    void ekle() {
        System.out.println("Yazilim bolumune kayit olacak ogrenciler : ");
        System.out.println("numara : ");
        numara = scan.nextInt();
        scan.nextLine();
        System.out.println("ad     : ");
        ad = scan.nextLine();
        System.out.println("soy ad : ");
        soyad = scan.nextLine();
        System.out.println("vize   : ");
        vize = scan.nextInt();
        System.out.println("final  : ");
        fin = scan.nextInt();

        OgrNode eleman = new OgrNode(numara, ad, soyad, vize, fin); // parametreleri yukarıda aldım.

        if (head == null) {
            head = eleman;
            tail = eleman;
            System.out.print("ilk kayit olustu , liste yapisi olusturuldu.");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numarali ogrenci kayit edildi.");

        }

    }

    void sil() {
        if (head == null) {
            System.out.println("liste bos silinecek eleman yok.");
        } else {
            System.out.println("silmek istediginiz ogrencinin numarasini giriniz : ");
            numara = scan.nextInt();

            if (numara == head.numara && head.next == null) {
                head = null;
                tail = null;
                System.out.println(numara + " numarali ogrenci silindi , listede ogrenci kalmadi .");

            } else if (numara == head.numara && head.next != null) {

                head = head.next;
                System.out.println(numara + " numarali ogrenci silinidi .");

            } else {
                temp = head;
                temp2 = head;
                while (temp.next != null) {

                    if (numara == temp.numara) {
                        temp2.next = temp.next;  // burası önemli, temp2 den sonra temp değil temp.next gelsin dedik
                        // yani tempin sonrasına atladık.
                        System.out.println(numara + " numarali ogrenci silinidi .");
                    }

                    temp2 = temp;
                    temp = temp.next;
                }
                if (numara == temp.numara) { // while a girmiyor yani tail de. son düğüm kontrolü için yaptık.
                    temp2.next = null;
                    tail = temp2;

                    System.out.println(numara + " numarali ogrenci silinidi .");
                }

            }

        }

    }

    void yazdir() {

        if (head == null) {

            System.out.println("Liste bos.");
        } else {
            temp = head;
            while (temp != null) {

                System.out.println(temp.numara + " numarali ogrencinin bilgileri : ");
                System.out.println("********************************");
                System.out.println("ad       :" + temp.ad);
                System.out.println("soyad    :" + temp.soyad);
                System.out.println("vize     :" + temp.vize);
                System.out.println("final    :" + temp.fin);
                System.out.println("ortalama :" + temp.ortalama);
                System.out.println("Durum    :" + temp.durum);
                System.out.println("********************************");

                temp = temp.next;
            }

        }
    }

    void enBasariliOgrenci() {

        if (head == null) {

            System.out.println("Liste bos.");
        } else {
            temp = head;
            double buyuk = temp.ortalama;

            while (temp != null) {

                if (buyuk < temp.ortalama) {
                    buyuk = temp.ortalama;

                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vize = temp.vize;
                    fin = temp.fin;
                    ortalama = temp.ortalama;
                    durum = temp.durum;
                }

                temp = temp.next;
            }
            System.out.println("en basarili ogrenci bilgileri : ");
             System.out.println(numara + " numarali ogrencinin bilgileri : ");
            System.out.println("********************************");
            System.out.println("ad       :" + ad);
            System.out.println("soyad    :" + soyad);
            System.out.println("vize     :" + vize);
            System.out.println("final    :" + fin);
            System.out.println("ortalama :" + ortalama);
            System.out.println("Durum    :" + durum);
            System.out.println("********************************");

//            System.out.println(temp.numara + " numarali ogrencinin bilgileri : ");
//            System.out.println("********************************");
//            System.out.println("ad       :" + temp.ad);
//            System.out.println("soyad    :" + temp.soyad);
//            System.out.println("vize     :" + temp.vize);
//            System.out.println("final    :" + temp.fin);
//            System.out.println("ortalama :" + temp.ortalama);
//            System.out.println("Durum    :" + temp.durum);
//            System.out.println("********************************");
            

        }
    }
    
    

}
