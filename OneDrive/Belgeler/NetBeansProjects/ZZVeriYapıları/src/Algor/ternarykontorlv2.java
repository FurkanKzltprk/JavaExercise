import java.util.Scanner;

public class ternarykontorlv2 {

    public static boolean isTernaryHeap(int[] heap) {
        int n = heap.length;
        boolean isMinHeap = true;
        boolean isMaxHeap = true;

        for (int i = 0; i < n; i++) {
            int leftChild = 3 * i + 1;
            int middleChild = 3 * i + 2;
            int rightChild = 3 * i + 3;

            // Min-Heap Kontrolü
            if (leftChild < n && heap[i] > heap[leftChild]) isMinHeap = false;
            if (middleChild < n && heap[i] > heap[middleChild]) isMinHeap = false;
            if (rightChild < n && heap[i] > heap[rightChild]) isMinHeap = false;

            // Max-Heap Kontrolü
            if (leftChild < n && heap[i] < heap[leftChild]) isMaxHeap = false;
            if (middleChild < n && heap[i] < heap[middleChild]) isMaxHeap = false;
            if (rightChild < n && heap[i] < heap[rightChild]) isMaxHeap = false;
        }

        // Eğer ne Min-Heap ne de Max-Heap ise false döner
        return isMinHeap || isMaxHeap;
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

        if (isTernaryHeap(heap)) {
            System.out.println("Girilen dizi bir ternary heap'tir.");
        } else {
            System.out.println("Girilen dizi bir ternary heap değildir.");
        }

        scanner.close();
    }
}
