import java.util.*;

//! Important Question 
//? Functions Q10: Fibonacci Series - 0 1 1 2 3 5 8 13 21 34 55 89 
public class A8_Functions_Q10 {
    public static void fibonacci(int n){
        int first = 0;
        int second = 1;
        int next;
        System.out.print("Fibonacci Series: ");
        System.out.print(first + " " + second + " "); //Printing first and second values.

        for(int i=1; i<=n; i++){
            next = first + second;
            System.out.print(next + " ");
            
            // Swapping
            first = second; // Transfer the value of 2nd to 1st
            second = next;  // Transfer the current value of next to 2nd
                            // Means 0 1 1 to 1 1 _  ....now next will be first + second = 2
                            // now it will be - 1 1 2
                        
                            // Again the second will be transferd to first 
                            // current value of next will be transfered to second.
                            // Means 1 1 2 to 1 2 _  ...now next will be first + second = 3
                            // Now it will be - 1 2 3

                            // This is repeated till n.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Upper Limit: ");
        int num = sc.nextInt();

        fibonacci(num);

        sc.close();
    }
}
