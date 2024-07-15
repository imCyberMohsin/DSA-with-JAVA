//! Recursion Basics 
// When a function calls itself until a specific condition is met. 

//? Functions Flow Basics
// A function is called from the main function
// After that the control directly goes to the functon defination and perfroms the tasks of that particular function.
// main-function -> function-call -> function-defination -> main-function

//? Infinte function calls (Stack overflow) 
// If a Function is called again inside a function, then the same function is executed again from the memeory.
// These function calls are called infinte times with previous function waiting in the memory to be executed successfully.
// Because there is no condition specified to stop the recursive calls, it results in stack-overflow(Out of memory).
// Solution: Write base condition when calling a recursive function.

public class A_Recursion_Basics {
    // * Example:
    static int count = 0;
    public static void counter() {
        if (count == 3) {       // base condition(for termination)
            return;
        } else {
            System.out.println(count);
            count++;
            counter();
        }
    }

    public static void main(String[] args) {
        counter();
    }
}


//? Breakdown of the above function
// 1. The counter() function is called from the main() function.
// 2. Now the function defination of counter() is executed.
// counter() Function defination breakdown:
/* 
    count = 0,
        line1 of the defination is executed (count == 3), it becomes false
        0 is printed
        count is incremented to 1
        again the counter() function is executed from the memory.
        function is not executed completely, so its kept in the memory [counter(), Line8]
    count = 1,
        again line1 is executed (count == 3), it becomes false
        1 is printed
        count is incremented to 2
        again the counter() function is executed from the memory.
        function is not executed completely, so its kept in the memory [counter(), Line8]
    count = 2,
        again line1 is executed (count == 3), it becomes false
        2 is printed
        count is incremented to 3
        again the counter() function is executed from the memory.
        function is not executed completely, so its kept in the memory [counter(), Line8]
    count = 3,
        again line1 is executed (count == 3), it becomes true
        So, the function returns and no further lines are executed.
        Finally, all the previous functions are also completed and the function terminates immediately.
*/ 


//? Stack Memory
// It Stores the functions which are yet to be completed 
// Later, functions are removed from the stack after complete execution.


//? Recursion Tree 
// The graphical representation of the execution flow of a function.
/* 
        main() (count = 0)
        |
        └── counter() (count = 0)
            |
            ├── counter() (count = 1)
            |   |
            |   ├── counter() (count = 2)
            |   |   |
            |   |   ├── counter() (count = 3, returns immediately)
            |   |
            |   └── (Returned from count = 2)
            |
            └── (Returned from count = 1)
        
        (Retuned from count = 0)
*/