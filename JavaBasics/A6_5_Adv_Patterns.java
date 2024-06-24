//? Advanced Patterns: 5.Diamond Pattern
/* 
       *          i=1 : (n/row - i) space=3, stars=1
      ***         i=2 : (n/row - i) space=2, stars=3
     *****        i=3 : (n/row - i) space=1, stars=5
    *******       i=4 : (n/row - i) space=0, stars=7
    *******       
     *****
      ***
       *
 */

import java.util.*;

public class A6_5_Adv_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5.Diamond Pattern");
        System.out.print("Enter the no. of rows: "); // n=4
        int row = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= row; i++) {
            // spaces
            int spaces = (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars 
            // start odd = 2*i-1
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = row; i >= 1; i--) {
            // spaces
            int spaces = (row - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
