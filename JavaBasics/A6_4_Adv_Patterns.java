//? Advanced Patterns: 4. Palindromic Pattern
/* 
        1           i=1: (n/row-i)space=4, print= 1
       212          i=2: (n/row-i)space=3, print= 212
      32123         i=3: (n/row-i)space=2, print= 321123
     4321234        i=4: (n/row-i)space=1, print= 4321234
    543212345       i=5: (n/row-i)space=0, print= 543212345
 */

import java.util.*;

public class A6_4_Adv_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("4. Palindromic Pattern");
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            //space
            int space= (row-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            // number
            // 1st half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // 2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
