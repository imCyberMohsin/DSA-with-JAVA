//! Bubble Sort Algorithm
// Bubble sort is a sorting algorithm which swaps the adjecent elements, if they are in wrong order.
// It pushes the maximum element to the last.

public class B_Bubble_sort {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6 };  // O(n)
        int arr[] = { 13, 46, 24, 52, 20, 9 };  // O(n^2)
        bubbleSort(arr);
        print(arr);
    }

    // ? Functions
    // With optimization for already sorted array
    public static void bubbleSort(int arr[]) {
        boolean didSwap = false;
        for (int i = arr.length - 1; i > 0; i--) {
            // Inner loop to iterate through the unsorted part of the array
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap j with j+1
                    swap(arr, j);

                    didSwap = true;
                }
            }
            // System.out.println("Run");
            
            //? Optimization: If array is already sorted - Time Complexity O(n)
            // If no swaps were made in this first pass, means the array is already sorted
            if (didSwap == false) {
                break;
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
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}

//? Worst Time Complexity : O(n^2)
// We have 2 loops :
// Outer Loop for each passes from last element to the second element
// Inner loop to iterate the unsorted part of the array and swap.

//? Best Time Complexity : O(n)
// When the array is already sorted, we don't have to perform any swap
// Also the Loop terminates immediately after N iterations, which is length of the array.

//? Space Complexity: O(1)
// No Extra Space is taken only few variables taking constant space.