//? Homework Q1: Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class A10_Arrays_hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of The Array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.next();
        }

        System.out.print("Names: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
