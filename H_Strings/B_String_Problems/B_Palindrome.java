//! Check if string is palindrome or not
// Eg: mom, dad

public class B_Palindrome {
    public static void main(String[] args) {
        String str = new String("dad");
        int n = str.length();

        System.out.println(palindrome(str, n));
    }

    // * Palindrome function
    static boolean palindrome(String str, int n) {
        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n / 2; i++) {
            // If last and first char are not same
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } 
            // If last and first char are same
            else {
                start++;
                end--;
            }
        }
        return true;
    }
    //? Time complexity: O(n) where n is the length of the string
    //? Space complexity: O(1) as only a constant amount of space is used
}