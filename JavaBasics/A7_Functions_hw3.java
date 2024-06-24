import java.util.*;

//? Homework 3: Function to print table on n.

public class A7_Functions_hw3 {
    public static void table(int num){
        for(int i=1; i<=10; i++){
            System.out.println(i+" x "+num +" = "+(i*num));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num = sc.nextInt();

        table(num);

        sc.close();
    }
}
