
package dizi_ekle_yazdir;

public class Dizi {
    int boyut;
    String[] elemanlar;
    int indis;

    // Yapıcı metod
    public Dizi(int boyut) {
        this.boyut = boyut;
        this.elemanlar = new String[boyut];
        this.indis = 0;
    }

    // Diziye eleman ekleme metodu
    public void ekle(String kelime) {
        if (this.indis < this.boyut) {
            this.elemanlar[this.indis] = kelime;
            this.indis++;
        } else {
            System.out.println("Dizi dolu, yeni eleman eklenemiyor.");
        }
    }

    // Diziyi yazdırma metodu
    public void yazdir() {
        if (this.indis <= 0) {
            System.out.println("Dizinin boş.");
        } else {
            System.out.print("[");
            for (int i = 0; i < indis; i++) {
                System.out.print(elemanlar[i]);
                if (i < indis - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
