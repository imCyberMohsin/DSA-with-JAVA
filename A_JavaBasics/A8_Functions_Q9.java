import java.util.*;

//! Important Question 
//? Functions Q9: Function to Calculate The GCD/HCF & LCM of two numbers.
//? GCD/HCF : It is the largest number dividing both the numbers. (No Remainder)
//? LCM : It is the number that is multiple of both the numbers. (No Remainder)
//* LCM = [(n1*n2)/GCD]
public class A8_Functions_Q9 {
    public static void gcd_lcm(int num1, int num2){
            int gcd = 1;
            // run loop minimum times
            int min = (num1>num2)?num2:num1;

            for(int i=1; i<=min;i++){
                if(num1%i==0 && num2%i==0){   // 9%1 && 18%1, 9%2 && 18%2, 9%3 && 18%3... 9%9 && 18%9
                    gcd = i;  //1, false, 3... 9
                }
            }
            System.out.println("GCD = "+gcd);

            int lcm = (num1*num2)/gcd;
            System.out.println("LCM = "+lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt(); // 9
        int num2 = sc.nextInt(); // 18

        gcd_lcm(num1,num2);

        sc.close();
    }
}
