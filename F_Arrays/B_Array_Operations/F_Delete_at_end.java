//! Delete an element at the end of an array

public class F_Delete_at_end {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // System.out.println(arr.length);
        int[] newArr = deleteAtEnd(arr);
        print(newArr);
    }

    public static int[] deleteAtEnd(int arr[]) {
        // Check if array is empty
        if (arr.length == 0) {
            return arr; // If array is empty, return as is
        }

        // 1. Create new array with 1 less slot
        int newArr[] = new int[arr.length - 1];

        // 2. Copy elements of arr to newArr
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    // ? Print Array Function
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// ? Time Complexity : O(n)
// ? Space Complexity : O(n)