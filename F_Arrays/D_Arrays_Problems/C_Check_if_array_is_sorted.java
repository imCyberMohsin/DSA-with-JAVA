//! Check if the array is sorted 

public class C_Check_if_array_is_sorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0, 7, 8 };

        System.out.println(isSorted(arr));
    }

    // ? Function to check if array is sorted
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                // Do nothing when array seems to be sorted(true condition)
            } else {
                // Return false at the moment it finds that the order is not correct
                return false;
            }
        }
        return true;
    }
}
