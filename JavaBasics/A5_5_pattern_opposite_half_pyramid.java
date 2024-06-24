//? Pattern-5: Opposite Half Pyramid
/* 
            *
          * * 
        * * *
      * * * *
    * * * * *
*/

import java.util.*;

public class A5_5_pattern_opposite_half_pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("5. Opposite Half Pyramid.");
    System.out.print("Enter No. of rows: ");
    int row = sc.nextInt();
    // System.out.print("Enter No. of columns: ");
    // int col = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for(int j=1; j<=row-i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

    sc.close();
  }
}