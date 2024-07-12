//! Prime Number
//? Concept: A number having 2 factors -> divisible by 1 and itself only.
// Logic: Keep a counter variable, if the number have 2 factors its a prime number.
// Examples: 3  = 1, 3
//           5  = 1, 5
//           7  = 1, 7
//           11 = 1, 11
//           13 = 1, 13
//           17 = 1, 17

public class Q6_Prime {
    // * Bruteforce Approach
    public static boolean prime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    // ? Time Complexity: O(n)
    // Iteration of the loop depends on the input 'n'

    // ? Space Complexity: O(1)
    // A 'count' variable is used to keep the track of count.
    // The size of variable 'count' remains constant (independent of the input size)

    // * Optimized Approach
    public static boolean primeOptimized(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    // ? Time complexity: O(sqrt(n))
    // ? Space Complexity: O(1), Remains same

    public static void main(String[] args) {
        System.out.println(prime(7));
        System.out.println(primeOptimized(7));
    }
}
