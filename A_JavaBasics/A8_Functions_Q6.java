import java.util.*;

//? Functions Q6: Infinite Loop Function
public class A8_Functions_Q6 {
    public static void infiniteLoop(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i>0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        infiniteLoop();

        sc.close();
    }
}
