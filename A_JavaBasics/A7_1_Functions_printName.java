//? 7.Functions / Methods in Java. 
//? Function is a block of code which performs a specific task or feature.
//? Functions reduces the repetetion of codes.
//? main function is the first function to be executed in a program.
//? Parameters: The value passed during the function defination.
//? Arguments: The Actual values passed during the function call.
//? Functions in memory: functions are stored in the stack Frame.
//? Function vs Methods.
//? Function can be called directly...wheras methods are those which are called through the objects of a class.  
/* 
        stack:      |               |
                    |               |
                    |  Function-2   |  -> Another function call from Main function.
                    |  Function-1   |  -> Another function is stored in the stack when the function is called by the main function.
                    | Main Function |  -> Main Fuction and its variables are stored in the stack first 
 */

import java.util.*;

public class A7_1_Functions_printName {
    //? 1. Print a given name in a function (Function Defination)
    public static void printName(String name) {
        System.out.println("Hii, " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        printName(name); // Function call

        sc.close();
    }
}