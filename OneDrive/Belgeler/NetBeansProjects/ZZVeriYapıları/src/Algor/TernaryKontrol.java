public class TernaryKontrol {

    // Verilen dizi bir ternary heap mi? (min veya max fark etmez)
    public static boolean isTernaryHeap(int[] heap) {
        int n = heap.length;

        // Her düğüm için kontrol
        for (int i = 0; i < n; i++) {
            // Çocukların indislerini hesapla
            int leftChild = 3 * i + 1;
            int middleChild = 3 * i + 2;
            int rightChild = 3 * i + 3;

            // Sol çocuk kontrolü
            if (leftChild < n) {
                if (!(heap[i] <= heap[leftChild]) && !(heap[i] >= heap[leftChild])) {
                    return false; // Ne min-heap ne max-heap
                }
            }

            // Orta çocuk kontrolü
            if (middleChild < n) {
                if (!(heap[i] <= heap[middleChild]) && !(heap[i] >= heap[middleChild])) {
                    return false; // Ne min-heap ne max-heap
                }
            }

            // Sağ çocuk kontrolü
            if (rightChild < n) {
                if (!(heap[i] <= heap[rightChild]) && !(heap[i] >= heap[rightChild])) {
                    return false; // Ne min-heap ne max-heap
                }
            }
        }

        // Tüm kontroller geçtiyse, heap'tir
        return true;
    }

    public static void main(String[] args) {
        // Örnek bir ternary heap
        int[] heap1 = {10, 15, 20, 30, 25, 35, 40};
        int[] heap2 = {40, 35, 30, 25, 20, 15, 10};
        int[] notHeap = {10, 15, 5, 30, 25, 35, 40, 34};

        // Kontrol
        System.out.println("Heap 1: " + (isTernaryHeap(heap1) ? "Heap'tir." : "Heap değildir."));
        System.out.println("Heap 2: " + (isTernaryHeap(heap2) ? "Heap'tir." : "Heap değildir."));
        System.out.println("Not Heap: " + (isTernaryHeap(notHeap) ? "Heap'tir." : "Heap değildir."));
    }
}
