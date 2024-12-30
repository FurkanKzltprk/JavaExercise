public class SelectionSort {
    // Diziyi sıralayan Selection Sort metodu
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) { // Dış döngü
            int minIndex = i; // Minimum elemanın indeksini tut
            for (int j = i + 1; j < n; j++) { // İç döngü
                if (array[j] < array[minIndex]) { // Daha küçük bir eleman bul
                    minIndex = j;
                }
            }
            // Minimum elemanı i. elemanla değiştir
            swap(array, i, minIndex);
        }
    }

    // İki elemanı yer değiştiren yardımcı metot
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Unsorted Array:");
        printArray(array);

        selectionSort(array); // Diziyi sıralar

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // Diziyi yazdıran metot
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
