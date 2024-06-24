//! if-elseif Ladder

import java.util.*;

public class A3_2_if_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if a Number is Positive, Zero or Negative.

        System.out.print("Enter A Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        sc.close();
    }
}
