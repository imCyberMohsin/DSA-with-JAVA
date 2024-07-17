//! Selection Sort Algorithm
// Find and select the minimum element in the unsorted array
// Swap the minimum element with the first element of the unsorted array.
/* 
    Eg: [13, 46, 24, 52, 20, 9]    
    Steps:
        Initial Array: [13, 46, 24, 52, 20, 9]
        
        1st Pass:
        [13(min), 46(jStart), 24, 52, 20, 9]    -> Here, j(9) is less than min(13)
        [9, 46, 24, 52, 20, 13]                 -> So, Swapped 9 with 13

        2nd Pass:
        [9, 46(min), 24(jStart), 52, 20, 13]    -> Here, j(13) is less than min(46)
        [9, 13, 24, 52, 20, 46]                 -> So, Swapped 13 with 46

        3rd Pass:
        [9, 13, 24(min), 52(jStart), 20, 46]    -> Here, j(20) is less than min(24)
        [9, 13, 20, 52, 24, 46]                 -> So, Swapped 20 with 24

        4th Pass:
        [9, 13, 20, 52(min), 24(jStart), 46]    -> Here, j(24) is less than min(52)
        [9, 13, 20, 24, 52, 46]                 -> So, Swapped 24 with 52

        5th Pass:
        [9, 13, 20, 24, 52(min), 46(jStart)]    -> Here, j(46) is less than min(52)
        [9, 13, 20, 24, 46, 52]                 -> So, Swapped 46 with 52

    Final Sorted Array: [9, 13, 20, 24, 46, 52]
*/

public class A_Selection_sort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        selectionSort(arr);
        print(arr);
    }

    // Selection Sort Algorithm
    public static int[] selectionSort(int arr[]) {
        // Outer loop to iterate over each element in the array except the last one
        for (int i = 0; i < arr.length - 1; i++) {
            // Set the initial minimum index to the current position of the outer loop
            int minIndex = i;

            // Inner loop to iterate the whole unsorted array and find the minimum element
            for (int j = i + 1; j < arr.length; j++) {
                // If a smaller element is found, update the minimum index
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element found with the element at the current position of
            // the outer loop
            swap(arr, minIndex, i);
        }
        return arr;
    }

    // Print Array
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Swap
    private static void swap(int arr[], int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

// ? Worst & Best Time Complexity: O(n^2)
// Due to its use of nested loops for sorting.

// ? Time Complexity: O(n)
// The algorithm sorts the array in place, requiring only a constant amount of
// additional space for the minIndex and temp variables.