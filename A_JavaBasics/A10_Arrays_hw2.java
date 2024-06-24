//? Homework Q2: Find the maximum & minimum number in an array of integers. 

import java.util.*;
public class A10_Arrays_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size
        System.out.print("Enter The Size of The Array: ");
        int size = sc.nextInt();

        // Array Declaration
        int arr[] = new int[size];

        // Input
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        // Min-Max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("\nMax = "+max);
        System.out.println("Min = "+min);

        sc.close();
    }
}
