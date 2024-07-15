//! Print Linearly from 1 to N

public class Q2_Print_from_1_to_n {
    public static void print1ToN(int i, int n) {    
        if (i > n) {                       // False till (5 > 5), true when (6 > 5)
            return;                        // Returns the function when base condition is True.
        }
        System.out.print(i + " ");
        print1ToN(i + 1, n);
    }

    public static void main(String[] args) {
        print1ToN(1, 5);
    }
}


//? Recursion Tree: 
// printN(1, 5) -> (2, 5) -> (3,5) -> (4, 5) -> (5, 5) -> (6, 5)true, returns

//? Time complexity: O(n)
// The no. of function calls depends on the input 'n'

//? Space complexity: O(n)
// The no. of functions on the stack memory depends on the size of input 'n'
// Bigger the n, more functions are halted in the stack memory.