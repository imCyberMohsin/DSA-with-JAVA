//! Left rotate an array by D places 
/* 
    Eg: arr = [1, 2, 3, 4, 5] and D = 2
    1st rotation: [2, 3, 4, 5, 1]
    2nd rotation: [3, 4, 5, 1, 2]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class F_Left_rotate_by_D_places {
    public static void main(String[] args) {
        // Initial array and ArrayList
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int d = 2;

        //? Uncomment to test brute force method
        brute(arr, d);
        print(arr);

        System.out.println();

        //? Use optimal method for ArrayList
        ArrayList<Integer> rotatedList = Optimal(list, d);
        print(rotatedList);
    }

    // Brute force method for array
    static void brute(int[] arr, int d) {
        int n = arr.length;
        // Handle cases where d is greater than length of array
        d = d % n;

        // Store the first d elements in tempArr
        int[] tempArr = new int[d];
        for (int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }

        // Shift the rest of the elements to the left by d positions
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Put back the elements from tempArr to the end of arr
        for (int i = n - d; i < n; i++) {
            arr[i] = tempArr[i - (n - d)];
        }
    }

    // Optimal method for ArrayList
    static ArrayList<Integer> Optimal(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        // Handle cases where k is greater than length of array
        k = k % n;

        // Store the first k elements in tempArr
        ArrayList<Integer> tempArr = new ArrayList<>(arr.subList(0, k));

        // Shift the rest of the elements to the left by k positions
        for (int i = k; i < n; i++) {
            arr.set(i - k, arr.get(i));
        }

        // Put back the elements from tempArr to the end of arr
        for (int i = 0; i < k; i++) {
            arr.set(n - k + i, tempArr.get(i));
        }

        return arr;
    }

    // Print ArrayList
    static void print(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Print array
    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}