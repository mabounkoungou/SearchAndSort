// BinarySearch.java
public class BinarySearch {
    public static int search(int[] arr, int searchValue) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == searchValue) {
                return mid; // Return the index if the value is found
            }

            if (arr[mid] < searchValue) {
                left = mid + 1; // Update the left boundary
            } else {
                right = mid - 1; // Update the right boundary
            }
        }
        return -1; // Return -1 if the value is not found
    }
}
/*
 * Works for only sorted arrays
 * time->O(log_2n)
 * random access
 */