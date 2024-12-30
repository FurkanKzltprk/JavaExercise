public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return heap[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            int[] newHeap = new int[capacity * 2];
            System.arraycopy(heap, 0, newHeap, 0, capacity);
            capacity *= 2;
            heap = newHeap;
        }
    }

    public void add(int value) {
        ensureCapacity();
        heap[size] = value;
        size++;
        heapifyUp();
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int value = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return value;
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
