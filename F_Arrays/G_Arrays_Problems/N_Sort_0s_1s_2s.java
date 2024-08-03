//! Sort An Array of 0s, 1s and 2s
// https://www.naukri.com/code360/problem-of-the-day/easy

import java.util.*;
import java.io.*;

public class N_Sort_0s_1s_2s {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 0, 0, 1, 0));
        int n = arr.size();

        sortArray(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //? Function 
    static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        // Counting 0s, 1s, 2s
        int count0 =0, count1=0, count2=0;
        for(int i=0; i<n; i++){
            if(arr.get(i) == 0){
                count0++;
            }
            else if(arr.get(i) == 1){
                count1++;
            }
            else if(arr.get(i) == 2){
                count2++;
            }
        }

        // Overwrite the indexes in the array
        int index = 0;
        for(int i=0; i<count0; i++){
            arr.set(index++, 0);
        }
        for(int i=0; i<count1; i++){
            arr.set(index++, 1);
        }
        for(int i=0; i<count2; i++){
            arr.set(index++, 2);
        }
    }
}