//! Delete an element from the beginning of an array

public class E_Delete_at_beginning {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int[] newArr = deleteAtBeginning(arr);
        print(newArr);
    }

    // ? Delete at beginning
    public static int[] deleteAtBeginning(int arr[]) {
        // Create a new array with 1 less slot
        int newArr[] = new int[arr.length - 1];

        // Copy all the elements, skipping the first one
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
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

// ? Time Complexity: O(n)
// ? Space Complexity: O(n)