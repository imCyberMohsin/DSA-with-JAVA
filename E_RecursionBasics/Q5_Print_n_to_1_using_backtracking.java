//! Print Linearly from N to 1 using Backtracking ( - is not allowed )
// Halt the printing by recursive calling a function before the print
// When the base case is met at end, and it returns, then the priting statements will be executed.

public class Q5_Print_n_to_1_using_backtracking {
    public static void printNto1(int i, int n) {
        if (i > n) {
            return;
        }
        printNto1(i + 1, n);
        System.out.print(i + " ");  // This line will be halted from execution and will be executed in reverse order when the last recursive function call returns.
    }

    public static void main(String[] args) {
        printNto1(1, 5);
    }
}

//* Breakdown 
// We are Halting the linear order print and putting the function to the stack memory.
// When the base case becomes true, the functions are returned from the top of stack memory.
// Now halted functions prints in reverse order(LIFO).

//? Recursion Tree: (1, 5) -> (2, 5) -> (3, 5) -> (4, 5) -> (5, 5) -> (6, 5) [true, returns, executes the remaining printing statement of all the functions from the stack] 
//? Time complexity: O(n)  -> No. of function calls depends on the input 'n'
//? Space complexity: O(n) -> 'n' stack memory is reserved by the 'n' no. of incomplete functions