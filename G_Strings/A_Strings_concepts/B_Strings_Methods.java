//! Strings Methods.
//? String methods are used for string manipulation. 

//? Common String Methods:
// 1. length(): Returns the length of the string.
// 2. charAt(int index): Returns the character at the specified index.
// 3. substring(int beginIndex): Returns a new string that is a substring of this string.
// 4. substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string.
// 5. equals(Object anObject): Compares this string to the specified object.
// 6. equalsIgnoreCase(String anotherString): Compares this string to another string, ignoring case considerations.
// 7. compareTo(String anotherString): Compares two strings lexicographically.
// 8. toLowerCase(): Converts all characters in the string to lower case.
// 9. toUpperCase(): Converts all characters in the string to upper case.
// 10. trim(): Returns a string whose value is this string, with any leading and trailing whitespace removed.
// 11. replace(char oldChar, char newChar): Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
// 12. contains(CharSequence s): Returns true if and only if this string contains the specified sequence of char values.

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
        System.out.println("charAt [1]: " + firstName.charAt(0));

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