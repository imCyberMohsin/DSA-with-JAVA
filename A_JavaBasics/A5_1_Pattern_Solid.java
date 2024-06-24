//! Pattern Printing in Java. 
//? We will use nested loops to solve pattern problems. 

//? 1. Solid Rectangle
        /* 
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
        */

import java.util.*;

public class A5_1_Pattern_Solid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Solid Rectangle.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter No. of columns: ");
        int col = sc.nextInt();

        // In this loop first the outer loop condition is checked and then the control goes to the inner loop.
        // Then the inner loop prints 1 column of stars ******* and then new-line is executed. 
        // After that the control goes back to the outer loop and condition is checked and again it enters the inner loop and prints another column of stars ******
        // The iteration goes on untill the outer loop condtion becomes false.
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
