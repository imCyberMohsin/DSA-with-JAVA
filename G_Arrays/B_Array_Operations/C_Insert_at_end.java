//! Insert an element at the end of an array

public class C_Insert_at_end {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(arr.length);
        int element = 7;
        int[] newArr = insertAtEnd(element, arr);
        print(newArr);
    }

    public static int[] insertAtEnd(int element, int arr[]) {
        // 1. Create new array with 1 extra slot
        int newArr[] = new int[arr.length + 1];

        // 2. Copy elements of arr to newArr
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[i] = arr[i];
        }

        // 3. Insert to the end of array
        newArr[newArr.length - 1] = element;

        return newArr;
    }

    // ? Print Array Function
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//? Time Complexity : O(n)
//? Space Complexity : O(n)