//! 2D-Arrays in Java.
//? 2D-Arrays is matrix, having rows & columns. 

import java.util.*;
public class B_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The No. of Rows & Columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Declare 2D Array
        // type arr2D[][] = new int[row][col]
        int arr2D[][] = new int[row][col];

        // Taking inputs in 2D-Array
        // outer loop for rows
        for(int i=0; i<row; i++){
            // inner loop for columns
            for(int j=0; j<col; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        // Displaying 2D-Array as matrix
        System.out.println("Matrix...");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println(); // Line Change after printing each column.
        }

        sc.close();
    }
}
