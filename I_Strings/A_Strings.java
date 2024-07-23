//! Strings in Java.
//? Strings are array of characters enclosed within single or double quotes.  
//? Strings are immutable, once created cannot be modified, if we still want to modify string then we have to create a new string.

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