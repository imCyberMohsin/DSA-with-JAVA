//! Binary Search in 2D Arrays/Matrices 

public class D_Binary_Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 11;

        int[] result = searchMatrix(matrix, target);
        for (int i : result) {
            System.out.print("[" + i + "]");
        }
    }

    // * Binary Search on Matrix
    public static int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[] { -1, -1 };
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return new int[] { mid / cols, mid % cols };
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 }; // Element not found
    }
}
