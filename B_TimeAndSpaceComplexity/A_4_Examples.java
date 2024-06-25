import java.util.Scanner;

public class A_4_Examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ! Examples on Time Complexity:
        //! Don't execute, Just Understand 

        // ? Example 1: Time Complexity
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        // Here, we are printing it n times 
        // Time complexity will be O(n)
        // Time complexity proportional to Input n

        // ? Example 2: Time Complexity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hii");
            }
        }
        // Here, we are printing nxn times
        // Time complexity will be O(n)^2

        // ? Example 3: Time Complexity
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) { // n times
            for (int j = 0; j < m; j++) { // m times
                System.out.println("Hii");
            }
        }
        // Here, Loop is running nxm times
        // Time complexity will be O(nxm)

        // ? Example 4: Time Complexity
        for (int i = 0; i < n; i++) {    // n times separately
            System.out.println("n");
        }
        for (int j = 0; j < m; j++){    // m times separately
            System.out.println("m");
        }
        // Here, two loop are running separately
        // Time complexity will be O(n+m)

        sc.close();
    }
}