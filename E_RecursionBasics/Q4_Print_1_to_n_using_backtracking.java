//! Backtracking Basic
//! Print 1 to N using Backtracking (+ is not allowed)
// Halt the printing in reverse order
// when the base condition becomes true, it starts returning from the stack from the top
// Now the halted function is completed in linear order.

public class Q4_Print_1_to_n_using_backtracking {
    public static void print1ToN(int i, int n) {
        if (i < 1){
            return;
        }
        print1ToN(i-1, n);
        System.out.print(i + " ");      //  This is Halted from execution
    }

    public static void main(String[] args) {
        print1ToN(5, 5);
    }
}


//* Breakdown of program
// All the numbers are iterated in reverse order, 5, 4, 3, 2, 1
// But the print is Halted by putting a recursive call before it
// Now when the base condition becomes true, then the halted functions are return form the stack memory from the top(LIFO).
// Then the halted functions complete their executions by printing them in linear order as 1, 2, 3, 4, 5

//? Recursion Tree: (5, 5) -> (4, 5) -> (3, 5) -> (2, 5) -> (1, 5) -> (0, 5) [true, returns, executes the remaining printing part of the function calls from the stack]
//? Time complexity: O(n)  -> No. of function calls depends on the input 'n'
//? Space complexity: O(n) -> 'n' stack memory is reserved by the 'n' no. of incomplete functions