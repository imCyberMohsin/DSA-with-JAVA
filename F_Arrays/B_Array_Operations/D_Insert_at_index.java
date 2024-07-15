//! Insert element at a given index in an array 

public class D_Insert_at_index {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(arr.length);
        int element = 45;
        int index = 3;
        int[] newArr = insertAtIndex(element, index, arr);
        print(newArr);
    }

    // ? Functions
    public static int[] insertAtIndex(int element, int index, int arr[]) {
        // 1. Extra slot
        int newArr[] = new int[arr.length + 1];

        // 2. Copy the elements from arr to newArr before the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // 3. Insert the element
        newArr[index] = element;

        // 4. Now copy the remaining elements from arr to newArr
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
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

//? Time Complexity : O(n)
//? Space Complexity : O(n)