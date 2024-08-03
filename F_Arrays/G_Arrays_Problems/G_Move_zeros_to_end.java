//! Move the zeros to the end of array 

public class G_Move_zeros_to_end {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2, 0, 0, 3, 4, 5, 0 };

        // brute(arr);
        optimal(arr);
        print(arr);
    }

    // ! Functions
    // * Bruteforce Approach :
    static int[] brute(int arr[]) {
        // 1.Store all the non-zero elements into a tempArr
        int tempArr[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempArr[index++] = arr[i];
            }
        }

        // 2.Put all the non-zero elements back to arr
        for (int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }

        // 3.Fill remaining elements in tempArr with zeroes
        // Not required(because empty slots in array are automatically assigned to zeros in java)
        // for (int i = index; i < arr.length; i++) {
        //     arr[i] = 0;
        // }

        return arr;
    }
    // ? Time complexity: O(2n) = O(n), 2 loops running separately till n
    // ? Space complexity: O(n), tempArr stores n number of non-zero elements


    // * Optimal Approach : 2 pointer, Inplace
    // Improvement - constant space O(1)
    static int[] optimal(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            // Find first zero
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for(int i=j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }

    // * Print Array
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
