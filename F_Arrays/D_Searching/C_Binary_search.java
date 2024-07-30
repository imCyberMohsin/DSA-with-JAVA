//! Binary search in 1D Array 
// Binary Search Algorithm is a searching algorithm used in a sorted array(Ascending or Descending).
// It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty.
// Can be use to minmize the search space of a problem

/* 
    Algorithm:
        1. Find the middle element of the array
        2. Check if the target element is greater or lesser than the middle element
            (If target element is lesser then search in the left part of the middle)
            (If target element is greater then search in the right part of the middle)
        3. If middle == target, search is found.
 */

public class C_Binary_search {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8, 9, 10, 23, 34 };
        int target = 23;

        System.out.println(binarySearch(arr, target));
    }

    // * Binary Search
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            // If mid == target, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // If Target is greater than the mid, move to the right part of mid
            if (target > arr[mid]) {
                start = mid + 1;
            }
            // else, go to left part, if target is less than mid
            else {
                end = mid - 1;
            }

            // Update the mid
            mid = (start + end) / 2;
        }
        return -1;
    }

    //? Time complexity: O(log n)
    //? Space complexity: O(1)
}