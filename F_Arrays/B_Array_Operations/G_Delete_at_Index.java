//! Delete an element at a given index in an array 

public class G_Delete_at_Index {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(arr.length);
        int index = 3; // 4 will be delted
        int[] newArr = deleteAtIndex(index, arr);
        print(newArr);
    }

    // ? Functions
    public static int[] deleteAtIndex(int index, int arr[]) {
        // 1. Less slot
        int newArr[] = new int[arr.length - 1];

        // 2. Copy the elements from arr to newArr before the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // 3. Now, skip the index to delete and  copy the remaining elements from arr to newArr
        for (int i = 0, j=0; i < arr.length; i++) {
            if(i != index){
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    // ? Print Array Function
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//? Time Complexity : O(n)
//? Space Complexity : O(n)