//! Find the majority element that appears more than n/2
// Link : https://www.naukri.com/code360/problems/majority-element_6783241 

import java.util.HashMap;

public class MajorityElement_I {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
        int n = arr.length;

        // System.out.println(majorityElementBrute(arr, n));
        // System.out.println(majorityElementBetter(arr, n));
        System.out.println(majorityElementOptimal(arr, n));
    }

    // ! Functions
    // * Bruteforce approach
    static int majorityElementBrute(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
    // ? Time complexity: O(n^2)
    // ? Space complexity: O(1)

    // * Better Approach : Use HashMap
    static int majorityElementBetter(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency and store as value in the map
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // check the majority element
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }
    // ? Time complexity: O(2n)
    // ? Space complexity: O(n)

    // * Optimal Approach : Moore's Voting Algorithm
    static int majorityElementOptimal(int arr[], int n) {
        int count = 0;
        int elem = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                elem = arr[i];
            } else if (arr[i] == elem) {
                count++;
            } else {
                count--;
            }
        }

        // Find the majority element
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elem) {
                counter++;
            }
        }
        if (counter > n / 2) {
            return elem;
        }
        return -1;
    }
    // ? Time complexity: O(2n)
    // ? Space complexity: O(1)
}
