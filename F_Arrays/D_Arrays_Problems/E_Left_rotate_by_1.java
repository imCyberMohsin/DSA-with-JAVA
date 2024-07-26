//! Left Rotate an array by one place 
/* 
    Example: arr[1, 2, 3, 4, 5]
    Left Rotated once: [2, 3, 4, 5, 1]

    Logic: 
        - Store the 1st element inside a temp variable
        - Left shift all the elements
        - now insert the 1st element(temp) to the end of array[n-1].
 */

public class E_Left_rotate_by_1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        leftRotateBy1(arr);
        print(arr);
    }

    //? Functions
    //* Rotate Array by 1 place
    static int[] leftRotateBy1(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        return arr;
    }
    // Time complexity: O(n)
    // Space complexity: O(1)

    //* Print Array
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}