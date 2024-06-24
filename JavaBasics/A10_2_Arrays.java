//! Array Question: Take an array as input from the user. Search for a given number x and print the index at which it occurs. 
// This Searching Technique is also called 'Linear Search'.

import java.util.*;

public class A10_2_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // ? Input
        // Instead of size we can also use, arr.length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ? Display Array
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // ? search
        System.out.print("\nEnter A Number To Find: ");
        int find = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                System.out.println(+find + " Found At Index [" + i + "]");
            }
        }

        sc.close();
    }
}
