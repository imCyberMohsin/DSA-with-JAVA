//! Union of two sorted arrays 
/* 
    Logic: 
    A new array with all the elements of array1 and array2 (no duplicats)
 */

import java.util.*;

public class I_Union_of_two_sorted_arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 3, 4, 7, 8 };

        // int unionArr[] = unionBrute(arr1, arr2);
        // print(unionArr);

        List<Integer> unionArr = unionOptimal(arr1, arr2);
        System.out.println(unionArr);
    }

    // * Bruteforce Approach : using HashSet
    static int[] unionBrute(int arr1[], int arr2[]) {
        // 1. Take a hashSet
        Set<Integer> set = new HashSet<>();

        // 2. Put all unique elements from Arr1 and Arr2 into the HashSet
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }

        // 3. Convert the set to an array
        int unionArr[] = new int[set.size()];
        int j = 0;
        for (int i : set) {
            unionArr[j++] = i;
        }

        // 4. Sort the unionArr
        Arrays.sort(unionArr);

        return unionArr;
    }

    // * Optimal Approach : 2 Pointers
    static ArrayList<Integer> unionOptimal(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        ArrayList<Integer> unionList = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            } else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }

    // * Print Array
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}