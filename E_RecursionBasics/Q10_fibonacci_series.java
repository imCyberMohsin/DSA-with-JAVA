//! Fibonacci Series (Multiple recursion calls)
// Eg: 0, 1, 1, 2, 3, 5, 8, 13
// Its sum of current + previous numbers
// current + previous = next

public class Q10_fibonacci_series {
    // ! Main Functions
    public static void main(String[] args) {
        fibonacciLoop(5);
        System.out.println("\n" + fibonacciRecursive(4));
    }

    // ? User Defined Functions
    // * Loop Approach
    public static int fibonacciLoop(int n) {
        int first = 0, second = 1, next;

        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;

            first = second;
            second = next;
        }
        return first;
    }

    // * Recursive Approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

// ? Time complexity : O(2^n)
// Each recursive call is calling 2 more recursive calls