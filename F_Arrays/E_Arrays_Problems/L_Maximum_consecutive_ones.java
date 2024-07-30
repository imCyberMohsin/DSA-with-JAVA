//! Maximum Consecutive Ones 
/* 
    Logic:
        Count the no. of 1s without any break
        Return the max number of occurance of 1's 

        Eg: {0, 1, 1, 0, 1, 1, 1, 0, 1}
        Max Occurance = 3
 */

public class L_Maximum_consecutive_ones {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 1, 1, 0, 1 };
        int n = arr.length;

        System.out.println(maxConsecutiveOnes(arr, n));
    }

    //* Function 
    static int maxConsecutiveOnes(int arr[], int n) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Count 1s
            if (arr[i] == 1) {
                count++;
            } else {
                // Reset the counter when 0 is encountered
                count = 0;
            }

            // Update Max
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    //? Time complexity: O(n)
    //? Space complexity: O(1)  
}
