// LinearSearch.java
public class LinearSearch {
    public static int search(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i; // Return the index if the value is found
            }
        }
        return -1; // Return -1 if the value is not found
    }
}


/*
 * works for both sorted and unsorted arrays
 * time->O(N)
 * sequential access
 */