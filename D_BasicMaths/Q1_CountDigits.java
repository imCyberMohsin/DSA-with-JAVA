//! Count Digits of a Number. 
// Example : 7789

public class Q1_CountDigits {
    public static int coutDigits(int n) {
        int count = 0;

        while (n != 0) {        // Loop stops when n==0
            count++;
            // int lastDigit = n % 10;    // 778.9, we will get remainder 9 as the last digit and so on.
            n = n / 10;                // Here we will now remove the last digit after decimal, It will become 778 and so on.
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(coutDigits(7789));
    }
}


//? Time Complexity: O(log10(n))
// The loop iteration is determined by the no. of digits in the original number.
// In each iteration the the number is divided by 10 and then the value is updated, until it becomes 0.
// so the time coplexity will be O(log[base10](n)).


//? Note: Time Complexity of Division operations will always be Logarithmic
// num / 10     =   O(log10(N))
// num / 5      =   O(log5(N))
// num / 2      =   O(log2(N))