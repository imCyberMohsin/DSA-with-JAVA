//! Factorial of N numbers
//? Concept
// 4! => 1 x 2 x 3 x 4 = 24
// 3! => 1 x 2 x 3 = 6

public class Q7_Factorial_of_n_numbers {
    public static int factoricalOfN(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factoricalOfN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factoricalOfN(4));
    }
}

/*
    Breakdown:
    The base condition will be false initially, true when (n == 0)

    Call stacks: return n * factorialOfN(n - 1)
    Initial call:
        factorialOfN(4)
    1st call:
        4 * factorialOfN(3)  -> Halted in the call stack
    2nd call:
        3 * factorialOfN(2)  -> Halted
    3rd call:
        2 * factorialOfN(1)  -> Halted
    4th call:
        1 * factorialOfN(0)  -> Halted
    5th call:
        The base condition becomes true and returns 1

    Returning...
    4th call:
        1 * 1 = 1  (n = 1)
    3rd call:
        2 * 1 = 2  (n = 2)
    2nd call:
        3 * 2 = 6  (n = 3)
    1st call:
        4 * 6 = 24  (n = 4)

    Finally, 24 is returned to the function call, as the factorial of 4.
*/

//? Time complexity: O(n)
//? Space complexity: O(n)