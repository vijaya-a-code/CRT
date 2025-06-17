import java.util.*;

public class ConnectRopes {
    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes)
            pq.add(rope);

        int totalCost = 0;

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int sum = a + b;
            totalCost += sum;
            pq.add(sum);
        }

        System.out.println("Minimum cost to connect ropes: " + totalCost);
    }
}
