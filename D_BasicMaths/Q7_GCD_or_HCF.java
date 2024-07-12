//! GCD or HCF of Two Numbers:
// Greatest common divisor OR Highest common factor

//? Concept
// Get all the factors of both the numbers
// Get the common factors dividing both the numbers
// Finally, take the highest number (GCD, HCF).

public class Q7_GCD_or_HCF {
    // * GCD Bruteforce
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    // ? Time Complexity : O(n) or O(num1)
    // The no. of iteration depends on the num1
    // In the worst case the loop will run num1 times.

    // ? Space Complexity: O(1)
    // Two variables 'i' & 'gcd' remains constant.
    // Size of the variables does not depend on the input size.

    // * GCD Optimized
    public static int gcdOptimized(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                // System.out.println(i);
                return i;
                // break;
            }
        }
        return 1;
    }
    // ? Time complexity : O(min(num1,num2))
    // ? Space complexity : O(1)

    //* GCD Euclidean Algorithm 
    public static int EuclideanAlgo(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else if (num2 > num1) {
                num2 = num2 % num1;
            }
        }

        if (num1 == 0) {
            return num2; // GCD is num2
        } else {
            return num1; // GCD is num1
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 12));
        System.out.println(gcdOptimized(6, 12));
        System.out.println(EuclideanAlgo(6, 12));
    }
}


//* 3. Euclidean Algorithm Approach
/* 
    GCD(n1, n2) = GCD(n1 - n2, n2), where n1>n2
    Apply the algorithm untill one of the number becomes 0

    Example-1 Appliying Euclidean Algorithm: (20, 15)
    GCD(20, 15) = Eu(20-15, 15)  = (5, 15)
    GCD(15, 5)  = Eu(15-5, 5)    = (10, 5)
    GCD(10, 5)  = Eu(10-5, 5)    = (5, 5)
    GCD(5, 5)   = Eu(5-5, 5)     = (0, 5)
    # Final GCD of (20, 15)      = (5)


    ! Problem: The alogorithm is making the time complexity O(N)
    Example-2 : (52, 10)
    GCD (52, 10) => (42, 10,), (32, 10), (22, 10), (12, 10), (2, 10), (10, 2), (8, 2), (6, 2), (4, 2), (2,2), (0,2), (2)

    ! Solution: modify the alogorithm and do modulo operation instead of subtraction
    New Algorithm => GCD(n1, n2) = GCD(n1- n2, n1), where n1>n2

    GCD(52, 10) => (2, 10), (10, 2), (0, 2), (2)
*/

//? Pseudo code : 
// Run a loop until any one num is 0
// Modulo divide the greater number with the smaller (greater % smaller)
// Lastly check, if num1 is 0, then num2 will be the GCD and vice versa.