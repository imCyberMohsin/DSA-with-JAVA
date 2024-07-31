//!  First and Last Position of an Element In Sorted Array
// Link: https://www.naukri.com/code360/problems/first-and-last-position-of-an-element-in-sorted-array_1082549 

public class A_First_and_last_occurance {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 5, 6, 6, 6 };
        int n = arr.length;
        int key = 6;

        int result = firstOccurance(arr, n, key);
        System.out.println("First Occurance at Index = " + result);

        int result2 = lastOccurance(arr, n, key);
        System.out.println("Last Occurance at Index = " + result2);
    }

    //! Functions 
    //* First Occurance
    static int firstOccurance(int arr[], int n, int key) {
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        int result = -1;

        while (start <= end) {
            // Key found
            // Store the mid index
            // To get the first occurance move to the left part.
            if (arr[mid] == key) {
                result = mid;
                end = mid - 1;
            }
            // Key greater than mid, move to right
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            // Key is smaller than mid, move to left
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }
    //? Time complexity: O(log n) 
    //? Space complexity: O(1) 
    
    //* Last Occurance
    static int lastOccurance(int arr[], int n, int key) {
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        int result = -1;

        while (start <= end) {
            // Key found
            // Store the mid index
            // To get the last occurance move to the right part.
            if (arr[mid] == key) {
                result = mid;
                start = mid + 1;
            }
            // Key greater than mid, move to right
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            // Key is smaller than mid, move to left
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }
    //? Time complexity: O(log n) 
    //? Space complexity: O(1) 
}

//? Overall Time complexity 
// O(log n) + O(log n) = O(log n)

//? Overall Space complexity
// O(1) + O(1) = O(1) 