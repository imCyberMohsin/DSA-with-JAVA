//! Sum of Largest row and its index

public class C_Largest_row {
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
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int sum;

        for (int i = 0; i < row; i++) {
            sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
                rowIndex = i;
            }
        }
        System.out.println("Max Sum = " + max);
        System.out.println("Row Index = " + rowIndex);
    }
}