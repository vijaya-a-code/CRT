import java.util.*;

public class ArrayProblems1{

    // 1. K Largest Elements in an Array
    public static List<Integer> kLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

    // 2. Find Median from Data Stream
    static class MedianFinder {
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() == minHeap.size()) {
                return (maxHeap.peek() + minHeap.peek()) / 2.0;
            } else {
                return maxHeap.peek();
            }
        }
    }

    // 3. Top K Frequent Elements
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(countMap.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 6, 4, 2};
        int k = 3;

        System.out.println("1. K Largest Elements:");
        System.out.println(kLargestElements(array, k));

        System.out.println("\n2. Median from Data Stream:");
        MedianFinder mf = new MedianFinder();
        for (int num : array) {
            mf.addNum(num);
            System.out.println("Added " + num + ", Current Median: " + mf.findMedian());
        }

        System.out.println("\n3. Top K Frequent Elements:");
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(topKFrequent(nums, k));
    }
}