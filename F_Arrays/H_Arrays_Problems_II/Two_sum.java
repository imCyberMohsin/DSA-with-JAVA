import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int target = 9;

        // int newArr[] = twoSumBrute(arr, n, target);
        int newArr[] = twoSumOptimalHashMap(arr, n, target);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    // ! Functions

    // * Bruteforce Approach :
    // Take two pointer, first at 0 and other at 1 and keep incrementing
    // check if sum of two pointers is equal to target
    // If equal, return the indexes else return {-1 -1}
    static int[] twoSumBrute(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }
    // ? Time complexity: O(n^2)
    // ? Space complexity: O(1)

    // * Optimal Approach: Using Hashmap
    static int[] twoSumOptimalHashMap(int arr[], int n, int target) {
        // Create a HashMap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // Calculate the moreNeeded number to complete the sum
            int moreNeeded = target - arr[i];
            // If moreNeeded is in the map, return the indices
            if (map.containsKey(moreNeeded)) {
                return new int[] { map.get(moreNeeded), i };
            }
            // Add the current value and its index to the map
            map.put(arr[i], i);
        }
        // Return -1, -1 if no solution is found
        return new int[] { -1, -1 };
    }
    //? Time complexity: O(n)
    //? Space complexity: O(n)  
}
