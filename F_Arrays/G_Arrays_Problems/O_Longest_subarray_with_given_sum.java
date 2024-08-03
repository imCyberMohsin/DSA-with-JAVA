//! Find the longest subarray with the given sum K
// Link : https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399
// Subarray = contigious part of array

public class O_Longest_subarray_with_given_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1 };
        int n = arr.length;
        int Ksum = 3;

        System.out.println(subarrayBruteforce(arr, n, Ksum));
    }

    // ! Function
    // * Bruteforce Approach
    // Find all the sub arrays
    // check the length and sum
    // Return the longest length which is equal to sum 
    static int subarrayBruteforce(int arr[], int n, int Ksum) {
        int longest = 0;
        for(int i=0; i<n; i++){
            int sum =0; // resets at each iteration of j
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == Ksum){    // upadating the longest, when sum == Ksum
                    longest = Math.max(longest, j-i+1);
                }
            }
        }
        return longest;
    }
    //? Time complexity : O(n^2)
    //? Space complexity: O(1)
}

/* Dry Run of the bruteforce approach:
 * arr = { 1, 2, 3, 1, 1, 1, 1 }
 * 
* Iteration with i = 0:
j = 0: Subarray [1], Sum is 1, not equal to 3.
j = 1: Subarray [1, 2], Sum is 3, which is equal to 3. Update longestSubarray to 2 (length of [1, 2]).
j = 2: Subarray [1, 2, 3], Sum is 6, not equal to 3.
j = 3: Subarray [1, 2, 3, 1], Sum is 7, not equal to 3.
j = 4: Subarray [1, 2, 3, 1, 1], Sum is 8, not equal to 3.
j = 5: Subarray [1, 2, 3, 1, 1, 1], Sum is 9, not equal to 3.
j = 6: Subarray [1, 2, 3, 1, 1, 1, 1], Sum is 10, not equal to 3.
* Iteration with i = 1:
j = 1: Subarray [2], Sum is 2, not equal to 3.
j = 2: Subarray [2, 3], Sum is 5, not equal to 3.
j = 3: Subarray [2, 3, 1], Sum is 6, not equal to 3.
j = 4: Subarray [2, 3, 1, 1], Sum is 7, not equal to 3.
j = 5: Subarray [2, 3, 1, 1, 1], Sum is 8, not equal to 3.
j = 6: Subarray [2, 3, 1, 1, 1, 1], Sum is 9, not equal to 3.
* Iteration with i = 2:
j = 2: Subarray [3], Sum is 3, which is equal to 3. Update longestSubarray to 1 (length of [3]), but longestSubarray remains 2 because 2 > 1.
j = 3: Subarray [3, 1], Sum is 4, not equal to 3.
j = 4: Subarray [3, 1, 1], Sum is 5, not equal to 3.
j = 5: Subarray [3, 1, 1, 1], Sum is 6, not equal to 3.
j = 6: Subarray [3, 1, 1, 1, 1], Sum is 7, not equal to 3.
* Iteration with i = 3:
j = 3: Subarray [1], Sum is 1, not equal to 3.
j = 4: Subarray [1, 1], Sum is 2, not equal to 3.
j = 5: Subarray [1, 1, 1], Sum is 3, which is equal to 3. Update longestSubarray to 3 (length of [1, 1, 1]).
j = 6: Subarray [1, 1, 1, 1], Sum is 4, not equal to 3.
* Iteration with i = 4:
j = 4: Subarray [1], Sum is 1, not equal to 3.
j = 5: Subarray [1, 1], Sum is 2, not equal to 3.
j = 6: Subarray [1, 1, 1], Sum is 3, which is equal to 3. The length of this subarray is 3, but it does not update longestSubarray as it is already 3.
* Iteration with i = 5:
j = 5: Subarray [1], Sum is 1, not equal to 3.
j = 6: Subarray [1, 1], Sum is 2, not equal to 3.
* Iteration with i = 6:
j = 6: Subarray [1], Sum is 1, not equal to 3.
 */
