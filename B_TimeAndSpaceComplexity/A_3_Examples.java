public class A_3_Examples {
    public static void main(String[] args) {
        //! Examples on Time Complexity:
        //! Don't execute the code, Just Understand 

        // ? Examples 1
        int N = 10;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Example 1");
            }
        }
        // * Breakdown
        // loop i is starting from 0 and goes till N.
        // loop j also starts from 0 and goes till N.
        // both i, j operations are constant(N times)
        // Time complexity = NxN
        //                 = N^2
        //                 = O(N^2)

        // ? Example 2
        // N = 10
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("Example 2");
            }
        }
        // * Breakdown
        // i=0 {j=0}
        // i=1 {j=0,1}
        // i=2 {j=0,1,2}
        // i=n {j=0,1,2...n}
        // Time complexity = N x N+1 / 2
        //                 = N^2/2 + N/2
        //                 = N^2/2
        //                 = N^2
        //                 = O(N^2)
    }
}