//? Pattern-8: Floyd's_triangle
/* 
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */

import java.util.*;

public class A5_8_Pattern_Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("8. Floyds_triangle.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();
        int number = 1;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++; //2,3,4....15
            }
            System.out.println();
        }

        sc.close();
    }
}