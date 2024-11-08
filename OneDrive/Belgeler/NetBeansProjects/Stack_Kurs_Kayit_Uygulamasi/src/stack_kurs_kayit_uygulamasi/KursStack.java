package stack_kurs_kayit_uygulamasi;

import java.util.Scanner;

public class KursStack {

    Scanner scan = new Scanner(System.in);
    KursNode top;

    int kontenjan;
    int sayac;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac = 0;
    }

    String tc;
    String ad;
    String soyad;
    String mezunBolum;

    void ekle() {  // push()

        System.out.println("Kursa kayit edilecek kisi bilgileri : ");
        System.out.println("tc no : ");
        tc = scan.nextLine();
        System.out.println("ad : ");
        ad = scan.nextLine();
        System.out.println("soyad : ");
        soyad = scan.nextLine();
        System.out.println("Mezun oldugu bolum: ");
        mezunBolum = scan.nextLine();

        KursNode eleman = new KursNode(tc, ad, soyad, mezunBolum);

        if (isFull()) {

            System.out.println("kurs kontenjanı dolu kayit alamiyoruz .");
        } else {
            if (isEmpty()) {
                top = eleman;
                System.out.println(top.tc + " numarali kisi kursa ilk kayit olarak eklendi ");
            } else {
                eleman.next = top;
                top = eleman;
                System.out.println(top.tc + "numarali kisi kursa eklendi");
            }

            sayac++;
        }

    }

    void sil() {
        if (isEmpty()) {
            System.out.println("kursta kayitli kimse yok !!");
        } else {
            System.out.println(top.tc + " numarali kisi silindi");
            top = top.next;
            sayac--;
        }
    }

    void yazdir() {
        if (isEmpty()) {
            System.out.println("Kursa kayitli kimse yok");

        } else {
            KursNode temp = top;
            System.out.println("Kursta kayitli kisi listesi  :");
            System.out.println("TCNo\tAd\tSoyad\tMezun bolum ");
            while (temp != null) {

                System.out.println(temp.tc + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.mezunBolum);

                temp = temp.next;

            }

        }
    }

    void enSonKayitOlanKisi() {

        if (isEmpty()) {
            System.out.println("Kursa kayitli kimse yok");

        } else {
            System.out.println(top.tc + "\t" + top.ad + "\t" + top.soyad + "\t" + top.mezunBolum);

        }

    }

    void kalanKontenjanSayisi() {

        System.out.println("toplam kayitli kisi sayisi : " + sayac);
        System.out.println("kalan kontenjan sayisi  :" + (kontenjan - sayac));

    }

    private boolean isFull() {
        return sayac == kontenjan;
    }

    private boolean isEmpty() {
        return sayac == 0;
    }

}
