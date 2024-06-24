//? Advanced Patterns: 2. Solid Rhombus
/* 
        *****           4 spaces : 5 stars
       *****            3 spaces : 5 stars
      *****             2 spaces : 5 stars
     *****              1 space  : 5 stars
    *****               0 space  : 5 stars

    # Logic of spaces:
    Here the spaces are (row/n - i)..... suppose row=5....then spaces in row can be calculated by
    1st row spaces = (5-1) = 4 spaces
    2nd row spaces = (5-2) = 3 spaces
    3rd row spaces = (5-3) = 2 spaces
    4th row spaces = (5-4) = 1 spaces
    5th row spaces = (5-5) = 0 spaces
 */

import java.util.*;

public class A6_2_Adv_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2. Solid Rhombus");
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            //space
            int spaces = (row-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
