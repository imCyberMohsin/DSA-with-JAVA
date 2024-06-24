//? 4.Factorial of a Number.

import java.util.*;

public class A7_4_Functions_factorial {
    public static void factorial(int num) {
        int factorial = 1;
        if (num < 0) {
            System.out.println("Invalid Number.");
            return;
        } else {
            for (int i = num; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("Factorial = " + factorial);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num = sc.nextInt();

        // call
        factorial(num);

        sc.close();
    }
}
