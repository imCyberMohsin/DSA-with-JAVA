//! Linear Search in 1D Array
// Return the index of element

public class A_Linear_search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int num = 5;    // index: 4
        int n = arr.length;

        System.out.println(linearSearch(arr, num, n));
    }

    //? Function
    static int linearSearch(int arr[], int num, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    //? Time complexity: O(n), one loop running from 0 to n which is the no. elements in the array
    //? Space complexity: O(1), no extra space is taken. 
}