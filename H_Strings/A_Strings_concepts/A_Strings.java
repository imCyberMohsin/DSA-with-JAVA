//! Strings in Java.
//? Strings are sequence of characters enclosed within single or double quotes.  
//? Each char of a String in Java is 2 bytes.
//? Strings are immutable, once created it cannot be modified, if we still want to modify string then we have to create a new string.
//? Java strings do not have a null character ('\0') at the end. The end of the string is determined by the length of the string.
//? String Pool: A special memory area where Java stores unique string literals to save memory and improve performance.

/* 
    ? new String() :
        In Java, using new String() creates a new instance of the String class, even if an identical string already exists in the string pool. 
        Eg: 
        String str = "Hello";
        String str2 = new String("Hello");
*/

/* 
    ? String Comparison :
        ==       : Checks if two references point to the same memory location.
        equals() : Checks if the contents of two objects are the same.
*/

import java.util.Scanner;

public class A_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a String
        String firstName = "Mohsin ";

        // Taking String Input
        System.out.print("Enter Your LastName: ");
        // String lastName = sc.next(); // single word input
        String lastName = sc.nextLine();
        System.out.println("Your Name is " + firstName + lastName);

        sc.close();
    }
}