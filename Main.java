// Main.java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Validate the input to ensure the number of elements is greater than 0
        while (n <= 0) {
            System.out.println("Number of elements must be greater than 0. Please try again.");
            System.out.print("Enter the number of elements in the array: ");
            n = scanner.nextInt();
        }

        // Create an array of size n to store the array elements
        int[] arr = new int[n];

        // Prompt the user to enter the array elements one by one
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the search or sort type (linear, binary, merge, or bubble)
        System.out.print("Enter the search or sort type (linear, binary, merge, bubble): ");
        String type = scanner.next().toLowerCase();

        // Validate the input to ensure it matches one of the valid search or sort types
        while (!type.equals("linear") && !type.equals("binary") && !type.equals("merge") && !type.equals("bubble")) {
            System.out.println("Invalid search or sort type. Please try again.");
            System.out.print("Enter the search or sort type (linear, binary, merge, bubble): ");
            type = scanner.next().toLowerCase();
        }

        // Record the start time of the operation
        long startTime = System.nanoTime();

        // Perform the selected operation based on the user's input
        switch (type) {
            case "linear":
                // For linear search, prompt the user to enter the search value
                System.out.print("Enter the search value: ");
                int linearSearchValue = scanner.nextInt();

                // Call the search method from the LinearSearch class to find the index of the value in the array
                int linearSearchIndex = LinearSearch.search(arr, linearSearchValue);

                // Print the result of the linear search
                if (linearSearchIndex != -1) {
                    System.out.println("Element found at index: " + linearSearchIndex);
                } else {
                    System.out.println("Element not found in the array.");
                }
                break;
            case "binary":
                // For binary search, prompt the user to enter the search value
                System.out.print("Enter the search value: ");
                int binarySearchValue = scanner.nextInt();

                // Sort the array using the Arrays.sort method
                Arrays.sort(arr);

                // Call the search method from the BinarySearch class to find the index of the value in the sorted array
                int binarySearchIndex = BinarySearch.search(arr, binarySearchValue);

                // Print the result of the binary search
                if (binarySearchIndex != -1) {
                    System.out.println("Element found at index: " + binarySearchIndex);
                } else {
                    System.out.println("Element not found in the array.");
                }
                break;
            case "merge":
                // For merge sort, call the sort method from the MergeSort class to sort the array
                MergeSort.sort(arr);

                // Print the array after merge sort
                System.out.println("Array after merge sort: " + Arrays.toString(arr));
                break;
            case "bubble":
                // For bubble sort, call the sort method from the BubbleSort class to sort the array
                BubbleSort.sort(arr);

                // Print the array after bubble sort
                System.out.println("Array after bubble sort: " + Arrays.toString(arr));
                break;
            default:
                System.out.println("Invalid search or sort type.");
        }

        // Record the end time of the operation
        long endTime = System.nanoTime();

        // Calculate the execution time in nanoseconds
        long executionTime = endTime - startTime;

        // Print the execution time
        System.out.println("Execution time: " + executionTime + " nanoseconds.");

        // Close the scanner to release system resources
        scanner.close();
    }
}