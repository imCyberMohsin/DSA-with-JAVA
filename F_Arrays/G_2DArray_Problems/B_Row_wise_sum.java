//! Sum of Matrix, Row wise

public class B_Row_wise_sum {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 1, 6, 3 },
                { 1, 1, 3 },
        };
        int row = 3;
        int col = 3;
        sum(arr, row, col);
    }

    // Function
    static void sum(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Row " + i + " = " + sum);
        }
    }
}