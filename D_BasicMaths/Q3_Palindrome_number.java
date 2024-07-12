//! Palindrome Number
//* Leetcode : https://leetcode.com/problems/palindrome-number/
//? Concept: Reversing a Number will be the same as the orignal. 
// Store the orignal-number inside a different variable
// Reverse The number and store it in other variable
// compare the reversed-number with the original-number
// If same, then it is a palindrome number.

public class Q3_Palindrome_number {
    public static boolean isPalindrome(int n) {
        int copyOfn = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }

        if (copyOfn == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
