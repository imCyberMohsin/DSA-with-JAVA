//? Pattern-3 Half Pyramid
/* 
    *
    * *
    * * *
    * * * *
    * * * * *
*/

import java.util.*;

public class A5_3_Pattern_Pyramid_half {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3. Half Pyramid.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        // System.out.print("Enter No. of columns: ");
        // int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}