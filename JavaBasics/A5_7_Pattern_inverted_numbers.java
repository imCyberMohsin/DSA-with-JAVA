//? Pattern-7: Inverted Half Pyramind of Numbers
/* 
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2 
    1
 */

import java.util.*;

public class A5_7_Pattern_inverted_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("7. Inverted Half Pyramid.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        // System.out.print("Enter No. of columns: ");
        // int col = sc.nextInt();

        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}