//! Set matrix zeros
// Code360: https://www.naukri.com/code360/problems/set-matrix-zeros_3846774 

public class Set_matrix_zeros {
    public static void main(String[] args) {
        int arr[][] = {
                { 7, 19, 3 },
                { 4, 21, 0 },
        };
        int n = arr.length;
        int m = arr[0].length;

        int newArr[][] = setMatrixZerosBrute(arr, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.err.println();
        }
    }

    // ! Functions
    static int[][] setMatrixZerosBrute(int matrix[][], int n, int m) {
        int row[] = new int[n];
        int col[] = new int[m];

        // Set -1 Instead of 0, initially
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        // Set Zeros Row
        for (int i = 0; i < n; i++) {
            if (row[i] == -1) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Set Zeros Col
        for (int j = 0; j < m; j++) {
            if (col[j] == -1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}