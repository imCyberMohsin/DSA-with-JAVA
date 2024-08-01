//! Reverse a String
// Take an empty temp variable, and a pointer pointing to the last of String.
// Now append one by one all the char from the end of string to the empty temp variable.

public class A_Reverse_a_String {
    public static void main(String[] args) {
        String str = "Mohsin";
        int n = str.length();

        System.out.println(reverseStringBrute(str, n));
        System.out.println(reverseStringOptimal(str, n));
    }

    //! Functions
    //* Bruteforce Approach
    static String reverseStringBrute(String str, int n) {
        String rev = "";

        int end = str.length() - 1;
        for (int i = 0; i < n; i++) {
            rev = rev + str.charAt(end);
            end--;
        }
        return rev;
    }
    //? Time complexity: O(n^2), due to the repeated string concatenations inside the loop.
    //? Time complexity: O(n), due to the space needed for the rev string.

    //* Optimal Approach : using StringBuilder
    static String reverseStringOptimal(String str, int n) {
        StringBuilder rev = new StringBuilder();

        int end = str.length() - 1;
        for (int i = 0; i < n; i++) {
            rev.append(str.charAt(end));
            end--;
        }
        return rev.toString();
    }
    //? Time complexity: O(n)
    //? Time complexity: O(n)
}
