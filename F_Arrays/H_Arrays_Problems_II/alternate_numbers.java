//!  Alternate Numbers
// Code360: https://www.naukri.com/code360/problems/alternate-numbers_6783445 

public class alternate_numbers {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, -5 }; // Output: {1, -4, 2, -5}
        int n = arr.length;

        int newArr[] = alternateNumbersOptimal(arr, n);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    // ! Functions
    // * Optimal approach
    // Take 2 index Pointers(postive and negative)
    // Take a new result array
    // Check each element of the array,
    //  - If Positive, insert in the postive index of the array and increment positive by 2
    //  - If Negative, insert in the negative index of the array and increment negative by 2
    // Finally return the result array
    static int[] alternateNumbersOptimal(int[] arr, int n) {
        int positive = 0;
        int negative = 1;

        int newArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                newArr[positive] = arr[i];
                positive += 2;
            } else {
                newArr[negative] = arr[i];
                negative += 2;
            }
        }
        return newArr;
    }
    // ? Time complexity: O(n)
    // ? Space complexity: O(n), Because an extra result array.
}