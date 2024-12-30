public class ternaryheapyazdirma {

    public static void main(String[] args) {
        // 1'den 13'e kadar olan sayilari bir diziye yerlestiriyoruz
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        System.out.println("Ternary Heap Gosterimi:");
        ternaryHeapYazdir(sayilar);
    }

    // Ternary Heap duzenini yazdiran metod
    public static void ternaryHeapYazdir(int[] sayilar) {
        int n = sayilar.length; // Dizi uzunlugu

        // Her dugum icin dongu
        for (int i = 0; i < n; i++) {
            // Mevcut dugumu yazdir
            System.out.println("Dugum: " + sayilar[i]);

            // Cocuklarinin indekslerini hesapla
            int solCocuk = 3 * i + 1;    // Sol cocuk indeksi
            int ortaCocuk = 3 * i + 2;  // Orta cocuk indeksi
            int sagCocuk = 3 * i + 3;   // Sag cocuk indeksi

            // Cocuklari kontrol edip yazdir
            if (solCocuk < n) {
                System.out.println("  Sol Cocuk: " + sayilar[solCocuk]);
            }
            if (ortaCocuk < n) {
                System.out.println("  Orta Cocuk: " + sayilar[ortaCocuk]);
            }
            if (sagCocuk < n) {
                System.out.println("  Sag Cocuk: " + sayilar[sagCocuk]);
            }
        }
    }
}
