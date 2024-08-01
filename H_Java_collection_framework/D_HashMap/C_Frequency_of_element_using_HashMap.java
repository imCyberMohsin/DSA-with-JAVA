//! Count the frequency of an element using hashMap 
import java.util.HashMap;

public class C_Frequency_of_element_using_HashMap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 3, 3, 5, 7, 7, 7 };
        int n = arr.length;
        int num = 1;

        count(arr, n, num);
    }

    // ! Function to count
    static void count(int arr[], int n, int num) {
        // Precomputing OR Hashing
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Fetch frequency
        if (map.containsKey(num)) {
            System.out.println(map.get(num));
        } else {
            System.out.println("Element not found");
        }
    }
}
