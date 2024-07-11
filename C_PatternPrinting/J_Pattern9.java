/* 
                        
            *            
           ***           
          *****          
         *******         
        *********        
        *********              
         *******               
          *****                
           ***                 
            *                  
*/

public class J_Pattern9 {
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
        pattern7(5);
        pattern8(5);
    }
}
