//! Quick Sort
// Quick sort is an divide and conquer algorithm.
// In quick sort we select a pivot(any element) and place it in its correct position called as partitionIndex,
// and then place all the elements smaller than the partition to its left and greater to its right
// finally sort the left and right parts using recursion.

public class E_Quick_sort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 0, 12, 2 };
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        print(arr);
    }

    // ? Functions
    //* Quick sort algorithm
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Placing the pivot in its correct position and getting the index
            int partitionIndex = partition(arr, low, high);

            // Sort Left part
            quickSort(arr, low, partitionIndex - 1);
            // Sort right part
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    //* Partition
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Left Part
            // Increment i while elements are less than or equal to pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Right Part
            // Decrement j while elements are greater than pivot
            while (arr[j] > pivot) {
                j--;
            }

            // Swap
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at j
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    //* Print Array
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//? Time complexity: O(N log N) 
//? Space complexity: O(1)