//? Advanced Patterns: 3. Number Pyramid
/* 
        1                  row 1: spaces = 4, number 1 times
       2 2                 row 2: spaces = 3, number 2 times
      3 3 3                row 3: spaces = 2, number 3 times
     4 4 4 4               row 4: spaces = 1, number 4 times
    5 5 5 5 5              row 5: spaces = 0, number 5 times
 */

import java.util.*;

public class A6_3_Adv_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3. Number Pyramid");
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            // spaces
            int spaces = (row-i);   // (row/n -i)
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
