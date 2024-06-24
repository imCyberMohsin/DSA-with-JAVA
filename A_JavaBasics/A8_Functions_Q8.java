import java.util.*;

//? Functions Q8: Take input of two numbers X & n. write a function to find the value of raised numbers n.
public class A8_Functions_Q8 {
    public static void findPower(int x, int xPow){
        int value = 1;
        for (int i=1; i<=xPow; i++){
            value = value * x;
        }
        System.out.println("Value = "+value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value of X & Power of X: ");
        int x = sc.nextInt();
        int xPow = sc.nextInt();

        findPower(x, xPow);

        sc.close();
    }
}
