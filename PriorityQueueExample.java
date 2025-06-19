import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println("Elements in Priority Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Retrieves and removes the head (smallest element)
        }
    }
}
