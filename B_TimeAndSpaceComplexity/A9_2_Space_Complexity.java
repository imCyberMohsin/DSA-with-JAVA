//! 2. Space Complexity:
//* Space Complexity: It is the amount of memory space used by an algorithm/program needs to run.
//* Example: Memory taken by declration of variable. 
//* Space complexity is also measured with Big-O notation.
// Boolean, number, undefined, null => Constant Space Complexity
// String, Array, Objects => Dynamic Space Complexity 

import java.util.*;

public class A9_2_Space_Complexity {
    public static void main(String[] args) {
        // ? Example 1: Space Complexity
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        // scanner object sc, integer n & integer i is stored in the memory.
        // Even if we increase the input size n, memory will not be affected because n
        // is stored only once and so is integer i.
        // So Space will be constant.

        // ? Example 2: Space Complexity
        // In case of Array
        // If we increase the input size n of the array then the memory space wil also
        // be increased.

        sc.close();
    }
}
