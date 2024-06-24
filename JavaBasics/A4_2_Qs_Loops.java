//! Questions on Loops. 

import java.util.*;

public class A4_2_Qs_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //? 1. Print sum of n natural numbers
        System.out.println("1. Print sum of n natural numbers...");
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+num+ " Natural Numbers = " +sum);


        //? 2. Print the Table of n
        System.out.print("\n2. Print Table of n...");
        System.out.print("\nEnter A Number: ");
        int table_of = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println((i+" X "+table_of+ " = "+(table_of*i)));
        }
        
        sc.close();
    }
}
