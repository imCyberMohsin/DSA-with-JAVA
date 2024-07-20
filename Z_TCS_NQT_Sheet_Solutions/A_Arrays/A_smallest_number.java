//! Find the smallest number in an array 

public class A_smallest_number {
    public static void main(String[] args) {
        int arr[] = {-1, 2, 5, 1, 3, 0 };
        System.out.println(smallest(arr));
    }

    // Function
    public static int smallest(int arr[]) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}

//? Time Complexity = O(n)