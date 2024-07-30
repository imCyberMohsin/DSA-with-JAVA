//! Find the missing number in an array 

public class K_Find_missing_number {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6 };

        System.out.println(missingNumberBruteforce(arr));
    }

    // * Bruteforce Approach : Using Linear Search
    static int missingNumberBruteforce(int arr[]) {
        // Iterate through all numbers from 0 to n-1
        for (int i = 1; i <= arr.length; i++) {
            boolean flag = false;
            // Check if the current number i is present in the array
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            // If the current number i is not found in the array, it's the missing number
            if (flag == false) {
                return i;
            }
        }
        return -1;
    }
    //? Time complexity: O(n^2) 
    //? Space complexity: O(1) 
}