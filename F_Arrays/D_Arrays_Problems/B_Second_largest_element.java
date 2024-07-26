//! Find the second largest element in an array
/* 
    Logic: 
        Find the largest elment of the array
        Then, the second largest will be the largest-1 index.

    Logic 2: 
        Initially take the first element as the largest
        now run loop to the whole array, and update the secondLargest and then the Largest.
        So, the previous largest will be the secondLargest.
 */

public class B_Second_largest_element {
    public static void main(String[] args) {
        int arr[] = { 2, 333, 443, 1000, 1, 0, 999, 1111 };

        System.out.println(secondLargestOptimal(arr));
    }

    // ? Functions
    // * Optimal Approach
    // Only one pass
    static int secondLargestOptimal(int arr[]) {
        int largest = arr[0];
        int sLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;     // Previous Largest will be the Second largest
                largest = arr[i];       // Updating the new Largest
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    // Time Complexity : O(n)
    // Space Complexity : O(1)
}
