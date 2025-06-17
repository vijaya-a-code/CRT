public class InsertionSortDescending {
    public static void insertionSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are smaller than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        
        insertionSortDesc(arr);
        
        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
