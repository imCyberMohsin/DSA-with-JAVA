//? 2.Function to add two numbers and return the sum. 

import java.util.*;

public class A7_2_Functions_sum {
    public static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sum(a,b);
        System.out.println("Sum = "+sum);

        sc.close();
    }
}
