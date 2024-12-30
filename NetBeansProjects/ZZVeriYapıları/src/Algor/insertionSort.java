
package Algor;

import java.util.Scanner;


public class insertionSort {
    
    //diziyi sıralayan Insertion sort algoritması
    
    public static void insertionSort(int [] array){
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i-1;
            
            //şuanki elemanı sıralı kısmına eklemek için yer ararız.
            while(j>=0 && array[j]> key){
                array[j+1] = array[j];
                j--;
            }
            
            array[j+1]=key;
        }
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
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz: ");
            dizi[i] = scan.nextInt();
        }

        System.out.println("Sırasız dizi: ");
        printArray(dizi);

        insertionSort(dizi);

        System.out.println("Sıralı dizi: ");
        printArray(dizi);

        scan.close();
    }
}

    
    
    

