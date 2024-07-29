//! Intersection of Two sorted Arrays

import java.util.*;

public class J_Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 8));

        ArrayList<Integer> result = intersectionBrute(arr1, arr2);
        System.out.println(result);
    }

    // * Intersection functioin
    static ArrayList<Integer> intersectionBrute(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i).equals(arr2.get(j))) {
                intersectionList.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return intersectionList;
    }
}