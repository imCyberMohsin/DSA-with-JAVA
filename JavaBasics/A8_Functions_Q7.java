import java.util.*;

//? Functions Q7: java function to take user input till the user want and end it when user want to end and lastly count the positive, negative and zeros entered.
public class A8_Functions_Q7 {
    public static void counter() {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        boolean isFinished = false;

        while (!isFinished) {
            System.out.print("Enter A Number / Enter 'end' to Stop: ");
            int number = sc.nextInt();

            if (sc.hasNextInt()) {
                if(number > 0){
                    positive++;
                } else if(number < 0){
                    negative++;
                } else{
                    zeros++;
                }
            } else{
                String input = sc.next();
                if (input.equalsIgnoreCase("end")) {
                    isFinished = true;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'end'.");
                }
            }
        }
        System.out.println("Positve Numbers = "+positive);
        System.out.println("Negative Numbers = "+negative);
        System.out.println("Zeros  = "+zeros);

        sc.close();
    }

    public static void main(String[] args) {

        counter();

    }
}
