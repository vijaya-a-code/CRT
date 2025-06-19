import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Insert values
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(3);
        minHeap.add(15);
        // Print and remove elements (in sorted order)
        System.out.println("Min-Heap values:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // poll() removes and returns the smallest element
        }
    }
}
