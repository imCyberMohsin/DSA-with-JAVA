//! Traverse an Array
// Traversal means visiting each elements of an array.
// We can easily traverse an array using loops.

public class A_Traversal {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 4, 7 };
        traverse(arr);
    }

    // ? Traverse Function
    public static void traverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//? Time complexity : O(n)
// Here the loop run 'N' times where 'N' is the size of array.