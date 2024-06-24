//!  Switch Case Statements in Java.

import java.util.*;

public class A3_3_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Greet.. 1:Hello, 2:Namaste, 3:Salam
        System.out.print("Choose A Button, (1/2/3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("1-Hello");
                break;
            case 2:
                System.out.println("2-Namaste");
                break;
            case 3:
                System.out.println("3-Salam");
                break;
            default:
                System.out.println("Invalid Button, Retry!");
                break;
        }
        sc.close();
    }
}
