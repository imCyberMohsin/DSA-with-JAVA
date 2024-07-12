//! Armstrong Number
//* Leetcode: https://leetcode.com/problems/armstrong-number/ 
//? Sum of cube of each digit of the number is equal to the the number itself. 
// 371 => 3^3 + 7^3 + 1^3 =  371 (Armstrong Number)
// 1634 => 1^4 + 6^4 + 3^4 + 4^4 =  1634 (Armstrong Number)

public class Q4_ArmstrongNumber {
    public static boolean isArmstrong(int n, int noOfDigits) {
        int copy = n;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            sum += (Math.pow(lastDigit, noOfDigits));
            n = n / 10;
        }
        System.out.println(sum);

        if (copy == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print(isArmstrong(1634, 4));
    }
}
