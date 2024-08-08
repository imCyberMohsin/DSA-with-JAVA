//!  Superior/Leader Elements in an array
// Leader: All the elements in the right of an element are smaller
// Code360: https://www.naukri.com/code360/problems/superior-elements_6783446

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_an_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2 };
        int n = arr.length;

        System.out.println(superiorElements(arr, n));
    }

    // ! Function
    static ArrayList<Integer> superiorElements(int arr[], int n) {
        ArrayList<Integer> leaderList = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                maxi = arr[i];

                leaderList.add(arr[i]);
            }
        }
        Collections.reverse(leaderList);
        return leaderList;
    }
    //? Time complexity: O(n) 
    //? Space complexity: O(n) 
}
