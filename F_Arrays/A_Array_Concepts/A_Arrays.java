//! Arrays in Java.
//? Arrays: Array is a list of elements of same type;
//? Syntax: type[] arrayName = new type[size];

import java.util.*;
public class A_Arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //? Declare
        // int[] marks = new int[3];
        // int marks[] = new int[3];

        // Declare & Initialize
        int marks[] = {98, 87, 84};

        //? Access with index
        // Arrays in java are zero-indexed
        marks[0] = 98;
        marks[1] = 87;
        marks[2] = 84;

        //? Printing
        // We cannot print Array elements without Index, without index it will give garbage value.
        System.out.println("Printing Array Elements...");
        System.out.println("marks[0]: " + marks[0]);
        System.out.println("marks[1]: " + marks[1]);
        System.out.println("marks[2]: " + marks[2]);

        //? Looping through Array Elements
        System.out.println("\nLooping Through Arrays...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks[" + i + "]: " + marks[i]);
        }

        //* In memory, array is stored in a linear way & takes memory according to the datatype
        //          An integer element takes 4-bytes memory
        //          A char element will take 2-bytes memory 


        //? Taking input in an Array...
        // In Java, Empty Array is initialized by (null '0') values, & the memory for the array is already reserved.
        System.out.println("\nTake Input in Array...");
        System.out.print("Enter The Size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Taking Input using Loop
        for (int i=0; i<size; i++){
            System.out.print("Enter Element " +i+ ": ");
            numbers[i] = sc.nextInt();
        }

        // Printing the elements using loop
        for(int i=0; i<size; i++){
            System.out.println("Element "+i+ ": "+numbers[i]);
        }

        sc.close();
    }
}
