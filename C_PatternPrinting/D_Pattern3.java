/* 
    1 
    1 2 
    1 2 3 
    1 2 3 4
    1 2 3 4 5
*/

// Hint found : No. of row = no. of iteration 

public class D_Pattern3 {
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3(5);
    }
}
