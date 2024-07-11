/* 
    1
    2 2
    3 3 3 
    4 4 4 4 
    5 5 5 5 5
*/

// Hint: We just have to print the row numbers

public class E_Pattern4 {
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(5);
    }
}
