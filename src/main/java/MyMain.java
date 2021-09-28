import java.util.Arrays;

public class MyMain {
    // Sorting:
    // Implement the selection sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] selectionSort(int[] arr) {
        int min_value = 1000000;
        int min_index = 0;

            for (int i = 0; i < arr.length; i++) {
                min_value = 1000000;
                for (int x = i; x < arr.length; x++) {
                    if (arr[x] < min_value) {
                        min_value = arr[x];
                        min_index = x;
                    }
                }
                //swap min_index with the first value (which keeps getting changed)
                int j = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = j;
            }
        return arr;
    }

    // Implement the insertion sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] insertionSort(int[] arr) {
        // REPLACE THIS WITH YOUR CODE
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
    }
}