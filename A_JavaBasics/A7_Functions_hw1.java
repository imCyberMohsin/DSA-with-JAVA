import java.util.*;

//? Homework 1: Check if a number is Prime or not.

public class A7_Functions_hw1 {
    public static void primeOrNot(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();

        primeOrNot(num);

        sc.close();
    }
}
