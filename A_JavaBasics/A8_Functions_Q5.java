import java.util.*;

//? Functions Q5: Function to take input of age and return if the person is eligible to vote or not.
public class A8_Functions_Q5 {
    public static void vote(int age){
        if (age > 18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        vote(age);

        sc.close();
    }
}
