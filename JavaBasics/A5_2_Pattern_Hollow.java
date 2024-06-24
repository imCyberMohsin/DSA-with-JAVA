//? Pattern-2: Hollow Rectangle
/* 
    * * * * * *
    *         *
    *         *
    * * * * * *
*/

import java.util.*;

public class A5_2_Pattern_Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2. Hollow.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter No. of columns: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // now we are in the cell (i,j)
                if(i==1 || j==1|| i==row || j==col){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}