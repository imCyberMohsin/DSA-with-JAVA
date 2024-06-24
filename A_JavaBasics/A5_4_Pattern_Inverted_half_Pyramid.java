//? Pattern-4: Inverted Half Pyramid
/* 
    * * * * *
    * * * * 
    * * * 
    * * 
    * 
*/

import java.util.*;

public class A5_4_Pattern_Inverted_half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("4. Inverted Half Pyramid.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        // System.out.print("Enter No. of columns: ");
        // int col = sc.nextInt();

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}