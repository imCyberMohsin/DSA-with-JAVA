//! Stings Homework Q2: Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”


import java.util.*;

public class A12_3_Strings_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sting: ");
        String str = sc.nextLine();

        System.out.println(str.replace("e", "i"));

        sc.close();
    }
}