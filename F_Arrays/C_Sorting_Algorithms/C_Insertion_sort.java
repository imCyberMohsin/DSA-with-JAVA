//! Insertion Sort
// Insertion Sort is like sorting a deck of cards in your hand. You start with one card (considering it as the sorted part) and then pick the next card from the unsorted part and insert it into its correct position in the sorted part. You keep doing this until all the cards are in the right order.
// Similarly, in Insertion Sort, you start with a sorted part (initially containing one element) and an unsorted part (the rest of the array). You pick one element at a time from the unsorted part and insert it into its correct position in the sorted part. This process is repeated until the entire array is sorted.

public class C_Insertion_sort {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6 }; // O(n)
        int arr[] = { 13, 46, 24, 52, 20, 9 }; // O(n^2)
        insertionSort(arr);
        print(arr);
    }

    // ? Functions
    public static void insertionSort(int arr[]) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j);

                // Move to the previous position to check the next pair
                // Move Left till correct position of the current number is found
                j--;
            }
        }
    }

    // Print Array
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap j with j+1
    private static void swap(int arr[], int j) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
    }
}

//? Worst & Average Case Time Complexity: O(n^2)
// Two loops are executed:
// First for iterating the whole array
// Other for swapping, when the order is not correct.

//? Best Case Time Complexity: O(n)
// Best case can be, when array is already sorted
// In best case, only the outer loop will iterate the whole array once means N times(length of array)
// And the while loop is not executed.

//? Time Complexity: O(1)
// It is using constant space, no extra space is used (in-place).
// The space utilization does not depend on input size, it remains constant even if the input size is increased.