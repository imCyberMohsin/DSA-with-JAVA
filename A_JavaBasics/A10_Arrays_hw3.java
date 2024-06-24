//? Homework Q3: Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg :   { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;

public class A10_Arrays_hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size
        System.out.print("Enter The Size of The Array: ");
        int size = sc.nextInt();

        // Array Declaration
        int arr[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        boolean isAscending = true;

        for (int i = 0; i < size-1; i++) {
            if (arr[i] > arr[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("\nArray is in Ascending Order.");
        } else{
            System.out.println("\nArray is in Descending Order.");
        }

        sc.close();
    }
}
