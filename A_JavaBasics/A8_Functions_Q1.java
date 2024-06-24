import java.util.*;

//? Functions Q1: Take input of 3 numbers and print their average. 
public class A8_Functions_Q1 {
    public static void average(int a, int b, int c){
        int avg = ((a+b+c)/3);
        System.out.println("Average = "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        average(num1, num2, num3);

        sc.close();
    }
}
