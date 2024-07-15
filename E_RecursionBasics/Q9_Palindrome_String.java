//! Check if a string is palindrome or not 
// Palindrome is a string which remains the same even after reverse.
// Eg: Mom, Madam

public class Q9_Palindrome_String {
    public static boolean palindrome(String str, int i) {
        // Base case: If the string has one character or none, it's a palindrome
        if (i >= str.length() / 2) {
            return true;
        }

        // comparison of last and first
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }

        // recursive call
        return palindrome(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "mom";
        System.out.println(palindrome(str, 0));
    }
}

// ? Time complexity: O(n/2)
// Time complexity will be n/2 because the recursive call is half of the string

// ? Space complexity: O(n/2)
// Space complexity will be n/2 because its string half of the recursive call in the call stack.