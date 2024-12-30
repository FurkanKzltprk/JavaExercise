
import java.util.Scanner;

public class TernaryKontrol2 {

    public static boolean isTernaryHeap(int[] heap) {
        int n = heap.length;

        for (int i = 0; i < n; i++) {
            int leftChild = 3 * i + 1;
            int middleChild = 3 * i + 2;
            int rightChild = 3 * i + 3;

            if (leftChild < n) {
                if (heap[i] > heap[leftChild]) {
                    return false; // Min-Heap kuralı ihlali
                }
            }

            if (middleChild < n) {
                if (heap[i] > heap[middleChild]) {
                    return false; // Min-Heap kuralı ihlali
                }
            }

            if (rightChild < n) {
                if (heap[i] > heap[rightChild]) {
                    return false; // Min-Heap kuralı ihlali
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        int[] heap = new int[size];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            heap[i] = scanner.nextInt();
        }

        System.out.println("Girilen dizi: " + (isTernaryHeap(heap) ? "Heap'tir." : "Heap değildir."));

        scanner.close();
    }
}
