/* 
        *********              
         *******               
          *****                
           ***                 
            *                  
*/

public class I_Pattern8 {
    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // Space before stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Space after stars
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern8(5);
    }
}
