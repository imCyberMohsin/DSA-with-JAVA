//? Question 2D-Array: Take a matrix as input from the user, search for the given number x and print the indices.  

import java.util.*;
public class A11_2_Arrays_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The No. of Rows & Columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Declare 2D Array
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
            System.out.println(); 
        }

        // Finding number x
        System.out.println("Enter A Number to Search: ");
        int x = sc.nextInt();
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(x == arr2D[i][j]){
                    System.out.println(x+" Found at "+i+","+j);
                }
            }
        }
        sc.close();
    }
}
