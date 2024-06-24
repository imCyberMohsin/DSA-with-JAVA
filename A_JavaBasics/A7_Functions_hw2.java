import java.util.*;

//? Homework 2: Check if a number is Even or Odd.

public class A7_Functions_hw2 {
    public static void oddEven(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();

        oddEven(num);
        
        sc.close();
    }
}
