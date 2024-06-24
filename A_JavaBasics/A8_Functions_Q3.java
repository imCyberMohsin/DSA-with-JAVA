import java.util.*;

//? Functions Q3: Take two numbers and return the greatest one.
public class A8_Functions_Q3 {
    public static void greater(int a, int b){
        if(a > b)
        {
            System.out.println("a is grater.");
        } else{
            System.out.println("b is greater.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        greater(num1,num2);

        sc.close();
    }
}
