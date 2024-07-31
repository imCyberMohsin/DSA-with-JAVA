//! Sum of All Elements in the matrix

public class A_sum_of_all_elements {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };
        int row = 3;
        int col = 3;
        int result = sum(arr, row, col);
        System.out.println("Sum = " + result);
    }

    // Function
    static int sum(int arr[][], int row, int col) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}