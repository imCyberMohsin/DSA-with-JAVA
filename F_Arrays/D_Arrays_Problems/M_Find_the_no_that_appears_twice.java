//! Find the number that appeared only once

public class M_Find_the_no_that_appears_twice {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 4, 1, 1, 2, 1 };
        int n = arr.length;

        System.out.println(findElement(arr, n));
    }

    // ! Function
    static int findElement(int arr[], int n) {
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            int count = 0;
            // count the occurance of each element
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Return the element if count is 1
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
    //? Time complexity: O(n^2)
    //? Space complexity: O(1)  
}