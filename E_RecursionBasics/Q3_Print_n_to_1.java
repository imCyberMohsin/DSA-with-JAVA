//! Print N to 1 using recursion

public class Q3_Print_n_to_1 {
    public static void printNto1(int n, int i) {
        if (n < i) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1, i);
        ;
    }

    public static void main(String[] args) {
        printNto1(5, 1);
    }
}


//? Recursion Tree: printNto1(5, 1) -> (4, 1) -> (3, 1) -> (2,1) -> (1, 1) -> (0, 1)true, returns 
//? Time complexity: O(n)  -> No. of function calls depends on the input 'n'
//? Space complexity: O(n) -> 'n' stack memory is reserved by the 'n' no. of incomplete functions