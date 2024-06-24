import java.util.*;

//? Functions Q4: Fuction that takes in the radius as input and returns the circumference of a circle. 
public class A8_Functions_Q4 {
    public static void circle(float radius) {
        float circumference = (2.0f * 3.14f * radius);
        System.out.println("Circumference = "+circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Radius of The Circle: ");
        float radius = sc.nextFloat();

        circle(radius);

        sc.close();
    }
}
