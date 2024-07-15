//! Insert an element at the beginning of an array. at index[0]
//? Concept:
// Create a new array with 1 extra slot
// Shift all elements to right
// Insert at the index[0]

public class B_Insert_at_beginning {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(arr.length);
        int element = 0;
        int[] newArr = insertAtBeginning(element, arr);
        print(newArr);
    }

    // ? Insert at beginning
    public static int[] insertAtBeginning(int element, int arr[]) {
        // Creating a new array with one extra slot
        int newArr[] = new int[arr.length + 1];

        // Here i is pointing to the last index of arr
        for (int i = arr.length - 1; i >= 0; i--) {
            // Shifting right all the elements and assigning it to the newArr
            newArr[i + 1] = arr[i];
        }

        // Insert the new element
        newArr[0] = element;

        return newArr;
    }

    // ? Print Array Function
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//? Time Complexity: O(n) 