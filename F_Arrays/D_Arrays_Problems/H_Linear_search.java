//! Search element in the array and return its index 

public class H_Linear_search {
    public static void main(String[] args) {
        int arr[] = { 1, 34, 53, 2, 12 };
        int n = 34;

        System.out.println(linearSearch(arr, n));
    }

    // ! Function Linear Search
    static int linearSearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            {
                if (arr[i] == n) {
                    return i;
                }
            }
        }
        return -1;
    }
}
