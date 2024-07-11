/* 
    *
    * *
    * * *
    * * * *
    * * * * *
*/

// Pattern:
// 1st row 1 star
// 2nd row 2 star ...and so on

public class C_Pattern2 {
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(5);
    }
}
