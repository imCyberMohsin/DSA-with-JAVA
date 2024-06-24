//! Time & Space complexity in java.

//? 1. Time Complexity...
//* Time Complexity: It is the amount of computational time taken by a program to run an algorithm/operation.   
//* Time complexity can increase in: Linear, Quadratic, Cubic, Log, Square. 
//* Higher the input size, higher will be the time & space complexity.
//* Types of Time Complexity in a program:
//   1) Best Case     -> Ω(1)        (Omega)
//   2) Average Case  -> θ(n+1/2)    (Theta)
//   3) Worst Case    -> O(n)        (Big O)
//* 1) Best Case: 1 operation 
//     Numbers = 1, 2, 3, 4, 5
//     Search : 1
//     It will take just 1 operation to find 1, so this is best case Ω(1). 
//* 2) Average Case: avg opearations
//     Numbers = 2, 1,, 3, 4, 5
//     => 1 + 2 + 3 + 4 + 5 / 5
//     => n(n+1)/2xn
//     => (n+1 / 2)
//* 3) Worst Case: n operations
//     Numbers =  1, 2, 3, 4, 5
//     Search : 5
//     Here, we have to perform n operations to get the value 5, so this is worst case O(n).

import java.util.*;

public class A9_1_Time_Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ? Example 1: Time Complexity
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        // Here, we are printing it n times 
        // Time complexity will be O(n)
        // Time complexity ∝ Input n

        // ? Example 2: Time Complexity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hii");
            }
        }
        // Here, we are printing nxn times
        // Time complexity will be O(n)^2

        // ? Example 3: Time Complexity
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j < m; j++) { // m times
                System.out.println("Hii");
            }
        }
        // Here, Loop is running nxm times
        // Time complexity will be O(nxm)

        // ? Example 4: Time Complexity
        for (int i = 0; i < n; i++) {    // n times separately
            System.out.println("n");
        }
        for (int j = 0; j < m; j++){    // m times separately
            System.out.println("m");
        }
        // Here, two loop are running separately
        // Time complexity will be O(n+m)

        sc.close();
    }
}