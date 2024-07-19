//! Strings Methods.
//? String methods are used for string manipulation. 

import java.util.*;

public class B_Strings_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "Mohsin";
        String lastName = "Ansari";

        // 1. Concatenation : Join two strings
        System.out.println("Concatenation: " + firstName + " " + lastName);

        // 2. Length(): returns the length of a string
        System.out.println("Length: " + (firstName.length() + lastName.length()));

        // 3. charAt(): returns the character at given index.
        System.out.println("charAt [1]: " + firstName.charAt(1));

        // 4. compareTo(): compare two strings
        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value
        System.out.print("compareTo: ");
        if(firstName.compareTo(lastName) == 0){
            System.out.println("Equal(0)");
        } else{
            System.out.println("Not Equal");
        }

        // 5. substring(): returns a part of a string from startIndex to endIndex-1
        String sentence = "Hii I am Mohsin";
        System.out.println("substring: "+sentence.substring(4, 15));

        sc.close();
    }
}