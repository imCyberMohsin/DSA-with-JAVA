//! Sort An Array of 0s, 1s and 2s
// https://www.naukri.com/code360/problems/sort-an-array-of-0s-1s-and-2s_892977

import java.util.*;
import java.io.*;

public class N_Sort_0s_1s_2s {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 0, 0, 1, 0));
        int n = arr.size();

        // sortArrayBetter(arr, n);
        sortArrayOptimalDNF(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // ! Function
    // * Bruteforce approach: Sort the array
    // ? Time complexity: O(n log n)
    // ? Space complexity: O(n)

    // * Better approach: using ArraList
    // Keep 3 variable and count 0s 1s 2s in a single iteration
    // Overwrite the 0s 1s 2s in the array
    static void sortArrayBetter(ArrayList<Integer> arr, int n) {
        // Counting 0s, 1s, 2s
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                count0++;
            } else if (arr.get(i) == 1) {
                count1++;
            } else if (arr.get(i) == 2) {
                count2++;
            }
        }

        // Overwrite the indexes in the array
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr.set(index++, 0);
        }
        for (int i = 0; i < count1; i++) {
            arr.set(index++, 1);
        }
        for (int i = 0; i < count2; i++) {
            arr.set(index++, 2);
        }
    }
    // ? Time complexity: O(2n)
    // => O(n) + O(3n)
    // => O(n) + O(n)
    // => O(2n)
    // ? Space complexity: O(1)

    // * Optimal Approach: Sort the array using "Dutch national flag algorithm"
    // Take Three pointer - low(0), mid(0 to n-1), high(n-1)
    // If mid element = 0, swap(arr[low], arr[mid]), low++ mid++
    // If mid element = 1, mid++
    // If mid element = 2, swap(arr[high], arr[mid]), mid--
    // At last array will be sorted, when mid==high
    static void sortArrayOptimalDNF(ArrayList<Integer> arr, int n) {
        // Pointers
        int low = 0, mid = 0, high = n - 1;

        // Looping and Swapping
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else if (arr.get(mid) == 2) {
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }
    //? Time complexity : O(n)
    //? Space complexity: O(1)  
}