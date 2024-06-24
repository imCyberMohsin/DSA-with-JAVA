//? Pattern-9: one-zero pattern
/* 
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    0 1 0 1 0 1
 */

import java.util.*;

public class A5_9_Pattern_one_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("9.. Zero-one Pattern.");
        System.out.print("Enter No. of rows: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1"+" ");
                } else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}