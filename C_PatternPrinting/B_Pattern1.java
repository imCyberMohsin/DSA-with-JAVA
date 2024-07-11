/* 
        * * * *
        * * * *
        * * * *
        * * * *
*/

public class B_Pattern1 {
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // This will print * * * *
                System.out.print("* ");
            }
            // This will break line after printing * * * * each time.
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(4);
    }
}
