//! Print all the divisors of a number
// Divide the number with X and if the remainder is zero, then it is divisible with X.

public class Q5_Print_All_Divisors {
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printDivisors(36);
    }
}

// ? Time Complexity: O(n)