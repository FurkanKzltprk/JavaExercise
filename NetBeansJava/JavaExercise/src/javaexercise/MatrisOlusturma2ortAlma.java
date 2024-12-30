package javaexercise;

public class MatrisOlusturma2ortAlma {
    public static void main(String[] args) {
        //4x4 lük matrisi 2x2 ye çevirip değerlerinin de ortalamasını alma.
        // Örnek giriş matrisi
        int[][] matris = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // İki kat küçültme işlemi
        int[][] kucukMatris = ikiKatKucult(matris);

        // Yeni matrisi ekrana yazdırma
        for (int i = 0; i < kucukMatris.length; i++) {
            for (int j = 0; j < kucukMatris[i].length; j++) {
                System.out.print(kucukMatris[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] ikiKatKucult(int[][] matris) {
        int satirUzunlugu = matris.length;
        int sutunUzunlugu = matris[0].length;

        // Yeni matrisin boyutunu belirleme (bir öncekinden iki kat küçük)
        int yeniSatirUzunlugu = satirUzunlugu / 2;
        int yeniSutunUzunlugu = sutunUzunlugu / 2;

        // Yeni matris oluşturma
        int[][] yeniMatris = new int[yeniSatirUzunlugu][yeniSutunUzunlugu];

        // Yeni matrisi doldurma
        for (int i = 0; i < yeniSatirUzunlugu; i++) {
            for (int j = 0; j < yeniSutunUzunlugu; j++) {
                // Her bir 2x2 bloğun ortalama değerini al
                int ortalama = (matris[2*i][2*j] + matris[2*i][2*j+1] + matris[2*i+1][2*j] + matris[2*i+1][2*j+1]) / 4;
                yeniMatris[i][j] = ortalama;
            }
        }

        return yeniMatris;
    }
}
