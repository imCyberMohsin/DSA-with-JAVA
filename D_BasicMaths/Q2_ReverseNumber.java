//! Reverse A Number
// Crate a variable reverse, with initial value = 0
// Extract the last digit of the number to reverse
// Finally, Multiply 'reverse' number with 10 and add the last digit to it.

public class Q2_ReverseNumber {
    public static int reverseNumber(int n) {
        int reverse = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123456));
    }
}

//? Time Complexity = O(log10(N)) 