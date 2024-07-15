//! Linear Search in an Array

public class H_Linear_Search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int element = 1;

        linearSearch(arr, element);
    }

    // Linear Search
    public static void linearSearch(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(element + " Found on Index " + i);
            }
        }
    }
}
