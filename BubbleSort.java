// BubbleSort.java
public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // Iterate over the array n-1 times
        for (int i = 0; i < n - 1; i++) {
            // Compare adjacent elements and swap them if they are in the wrong order
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}