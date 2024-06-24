import java.util.*;

//? Functions Q2: Print sum of all odd numbers from 1 to n.
public class A8_Functions_Q2 {
    public static void sumN(int num){
        int sum =0;
        for (int i=1; i<=num; i++){
            if(i % 2 != 0){
                sum = sum +i;
            }
        }
        System.out.println("Sum of Odd From 1 to "+num+" = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Numbers: ");
        int num = sc.nextInt();
        
        sumN(num);

        sc.close();
    }
}
