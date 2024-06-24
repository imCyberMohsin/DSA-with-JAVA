//! Conditionals in Java.... if-else
//? Run a Block of code with specific conditons to run or not.

import java.util.*;

public class A3_1_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else...Adult or not
        System.out.println("if-else...");
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You Are An Adult.\n");
        }
        else{
            System.out.println("You Are Not An Adult.\n");
        }


        // if-else...odd or even
        System.out.println("Even or Odd...");
        System.out.println("Enter A Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num+" is Even.");
        } else{
            System.out.println(num+" is Odd.");
        }

        // Nested if-else
        // Check 2 numbers are equal, lesser or greater
        System.out.println("\nEqual, Greater or Lesser");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println("Equal.");
        }
        else{
            if (num1 > num2){
                System.out.println("num1 is greater.");
            }
            else{
                System.out.println("num1 is lesser");
            }
        }
        sc.close();
    }
}
