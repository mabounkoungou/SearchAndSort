// MergeSort.java
public class MergeSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: if the array has 0 or 1 element, it is already sorted
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid); // Copy the left half of the array
        System.arraycopy(arr, mid, right, 0, arr.length - mid); // Copy the right half of the array

        sort(left); // Recursively sort the left subarray
        sort(right); // Recursively sort the right subarray
        merge(arr, left, right); // Merge the sorted subarrays
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the elements from the left and right subarrays into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]; // Copy element from the left subarray
            } else {
                arr[k++] = right[j++]; // Copy element from the right subarray
            }
        }

        // Copy the remaining elements from the left subarray, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements from the right subarray, if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
