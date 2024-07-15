//! Sum of first N numbers 

public class Q6_Sum_of_first_n_numbers {
    public static void main(String[] args) {
        System.out.println(sumOfN(5, 0));
        System.out.println(sumOfN2(5));
    }

    //! Functions
    //? 1. Parameterized Approach
    public static int sumOfN(int i, int sum) {
        if (i < 1) {
            return sum;
        }
        return sumOfN(i - 1, sum + i);
    }
    //? Breakdown of Parameterized Approach
    // Given (i=5, sum=0), Base condition becomes true (i < 1) means i=0
    /*
        Recursive Function Calls/ Recursion Tree:
        (i-1, sum+i)
        (5-1, 0+5)  => (4, 5)
        (4-1, 5+4)  => (3, 9)
        (3-1, 9+3)  => (2, 12)
        (2-1, 12+2) => (1, 14)
        (1-1, 14+1) => (0, 15)
                        here 'i' become 0 and so the base condtion is met,
                        Then the final sum is printed and the function returns.
    */
    //? Time complexity: O(n)  -> No. of function calls depends on the input 'n' or 'i' variable, it goes from i to 0
    //? Space complexity: O(n) -> No. of call stacks depends on the size of the input 'n' or 'i' variable


    //* 2. Functional Approach
    public static int sumOfN2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN2(n - 1);      // Its an incomplete/halted line of code which is completed after the base condition returns.
    }
    /* Breakdown of Functional Approach:
    1. First recursive call:
        n + sumOfN2(n - 1)
        5 + sumOfN2(4) -> Halted in stack calls
    2. Second recursive call:
        4 + sumOfN2(3) -> Halted
    3. Third recursive call:
        3 + sumOfN2(2) -> Halted
    4. Fourth recursive call:
        2 + sumOfN2(1) -> Halted
    5. Fifth recursive call:
        1 + sumOfN2(0) -> n becomes 0

    Now, the base condition is executed and returns 0 to the halted function calls.
    Returning...
    1. Fifth call:
        1 + 0 = 1
    2. Fourth call:
        2 + 1 = 3
    3. Third call:
        3 + 3 = 6
    4. Second call:
        4 + 6 = 10
    5. First call:
        5 + 10 = 15

    Finally, 15 is returned to the function call in main.
    */
}