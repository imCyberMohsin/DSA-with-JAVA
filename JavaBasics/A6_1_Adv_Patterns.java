//? Advanced Patterns: 1. Butterfly Pattern
/* 
    *               *
    * *           * *
    * * *       * * *
    * * * * * * * * *
    * * * * * * * * *
    * * *       * * *
    * *           * *
    *               *
 */

import java.util.*;

public class A6_1_Adv_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Butterfly Pattern.");
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();

        // Upper Half
        for(int i=1; i<=row; i++){
            // 1st part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (row-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for(int i=row; i>=1; i--){
            // 1st part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (row-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // 2nd part stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
