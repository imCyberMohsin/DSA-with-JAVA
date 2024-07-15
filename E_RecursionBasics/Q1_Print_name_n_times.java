//! Print name n times using recursion

public class Q1_Print_name_n_times {
    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Mohsin " + i);
        printName(i + 1, n);
    }

    public static void main(String[] args) {
        printName(1, 5);
    }
}

//? Recursion Tree
// mainCall(1,5) ->  (2, 5) -> (3, 5) -> (4, 5) -> (5, 5) -> (6, 5) [True, function returns back, Function Terminates]

//? Time complexity : O(n) 
// The no. of recursive function calls depends on the size the 'n'

//? Space complexity: O(n)
// 'n' functions were halted and waiting in the stack-memory(Temporary) to be executed completely.