/* 
        1 
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1 
 */

public class L_Pattern11 {
    public static void pattern11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern11(5);
    }
}
