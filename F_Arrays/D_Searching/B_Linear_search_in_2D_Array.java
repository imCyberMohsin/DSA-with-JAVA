//! Linear search in 2D Arrays 

public class B_Linear_search_in_2D_Array {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {6, 6, 7, 8, 9},
            {10, 11, 12, 13}
        };
        int num = 2;

        int result[] = linearSerach2Darray(arr, num);
        for(int i: result){
            System.out.print("["+ i + "]");
        }
    }

    // Function
    static int[] linearSerach2Darray(int arr[][], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    //? Time complexity: O(n * m)
    //? Space complexity: O(1) 
}
