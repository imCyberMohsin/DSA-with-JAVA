//? 3.Function to multiply two numbers and return the product. 

import java.util.*;

public class A7_3_Functions_product {
    public static int product(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product = "+product(a,b));

        sc.close();
    }
}
