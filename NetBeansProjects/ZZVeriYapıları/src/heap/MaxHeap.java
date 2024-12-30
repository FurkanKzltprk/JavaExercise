public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Max-Heap'e eleman ekle
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap kapasitesi dolu!");
        }

        // Elemanı sona ekle
        heap[size] = value;
        int currentIndex = size;
        size++;

        // Yukarıya doğru düzenleme (heapify up)
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            // Eğer mevcut eleman, ebeveyninden büyükse yer değiştir
            if (heap[currentIndex] > heap[parentIndex]) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex; // Bir üst seviyeye çık
            } else {
                break; // Eğer ebeveyn büyükse dur
            }
        }
    }

    // İki elemanı yer değiştir
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Heap'i ekranda göster
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main Method for Testing
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10); // Kapasite 10 olarak belirlendi

        System.out.println("Heap'e eleman ekliyoruz...");
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);
        maxHeap.insert(2);

        System.out.println("Heap'in son hali:");
        maxHeap.printHeap();
    }
}
