/* 
                        space,star,space
        *                  [4, 1, 4]
       ***                 [3, 3, 3]
      *****                [2, 5, 2]
     *******               [1, 7, 1]
    *********              [0, 9, 0]
*/

// calculate the spaces and stars carefully 
// Tip: use '-' for spaces to visualize better

public class H_Pattern7 {
    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // Space before stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Space after stars
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern7(5);
    }
}
