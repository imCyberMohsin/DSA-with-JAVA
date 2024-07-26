//! Input in JAVA 
//? We can take input in Java Using two ways:
//  1. Scanner Class
//  2. BufferedReader Class

import java.util.*;

public class A2_2_Input {
    public static void main(String[] args) {
        // ? Creating Scanner Object from java.util package.
        Scanner sc = new Scanner(System.in);
        
        // Full String Input
        System.out.print("Enter A Full String: ");
        String str = sc.nextLine();
        System.out.println("String: "+str);

        // Single String Input
        System.out.print("\nEnter Your Name: ");
        String name = sc.next();
        System.out.println("Your Name is " + name);

        // Integer Input
        System.out.print("\nEnter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Your Age is: " + age);

        // nextFloat()
        // nextDouble()

        //? Question: Take input of two numbers and display their sum.
        System.out.println("\nEnter Values of a & b...");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);

        // Closing the Scanner
        sc.close();
    }
}