//! Remove duplicates in-place from a sorted array (without new Array) and return the number of unique elements
/* 
    Logic: (Two pointer approach)
        Take a counter variable from i=0
        Iterate the whole array from j=1 and check
        If index[j] is not equal to index[j], if true
        Then index[i+1] will have the value of index[j]
        and increment the value of counter
        and finally return counter+1
 */

public class D_Remove_duplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 5, 6, 7, 8 };

        System.out.println(removeDuplicates(arr));
        print(arr);
    }

    // ? Functions
    // * Bruteforce Approach : Use set data structure

    // * Optimal Approach : 2 pointer approach
    static int removeDuplicates(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    //? Time Complexity: O(n)
    // The loop is running from 1 to no. of elements in the array
    //? Space Complexity: O(1)
    // Since no additional space proportional to the input size is used.

    //* Print Array
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
