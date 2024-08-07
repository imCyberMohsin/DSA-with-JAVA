//!  Maximum Subarray Sum
// Code360: https://www.naukri.com/code360/problems/maximum-subarray-sum_630526 
// Leetcode: https://leetcode.com/problems/maximum-subarray/description/

public class Maximum_subArray_sum {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 7, -4, 3, 2, -10, 9, 1 }; // Output: 11
        int arr[] = { 10, 20, -30, 40, -50, 60 }; // Output: 60
        int n = arr.length;

        System.out.println(maxSubArrayBetter(arr, n));
        System.out.println(maxSubArrayOptimal(arr, n));
    }

    // ! Functions
    // * Better Approach
    static int maxSubArrayBetter(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    // ? Time complexity: O(n^2)
    // ? Space complexity: O(1)

    // * Optimal Approach : Kadane's Algo
    // 1. Initialize max to the smallest possible value or arr[0] and sum to 0
    // 2. Iterate through each element of the array
    //      - Step 1: Add the current element to sum
    //      - Step 2: Update max, if sum is greater
    //      - Step 3: If sum becomes negative, make sum 0
    // 3. Return the max
    static long maxSubArrayOptimal(int arr[], int n) {
        long max = Long.MIN_VALUE, sum = 0;

        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];

            // Update max if the current sum is greater than the current max
            if (sum > max) {
                max = sum;
            }

            // If the sum becomes negative, reset it to 0
            if (sum < 0) {
                sum = 0;
            }
        }
        // If the maximum subarray sum is negative, return 0
        if (max < 0) {
            return 0;
        }
        return max;
    }
    //? Time complexity: O(n)
    //? Space complexity: O(1)  
}