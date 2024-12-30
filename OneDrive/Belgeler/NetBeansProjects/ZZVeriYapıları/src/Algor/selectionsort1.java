package Algor;

import java.util.Scanner;

public class selectionsort1 {
    //diziyi sıralayan selection sort algoritmasının kodu ↓↓

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) { // dıştaki döngü 
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { // içteki döngü
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

            }
            //swap metodunu burda kullan.
            swap(array, i, minIndex);
        }
    }
                
    public static void swap(int[] dizi, int i, int j) {
        int temp = dizi[i];
        dizi[i] = dizi[j];
        dizi[j] = temp;
    }

    public static void printArray(int[] dizi) {
        for (int num : dizi) {
            System.out.print(num + " <- ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dizi = new int[6];

        // 6 adet sayı girilecek
        int sayi;
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ".sayiyi giriniz : ");
            dizi[i] = scan.nextInt();
        }

        System.out.println("sirasiz dizi :  ");
        printArray(dizi);

        selectionSort(dizi);

        System.out.println("Sirali dizi");
        printArray(dizi);
        scan.close();

    }

}
