//! Find the Largest element in an array

public class B_largest_number {
    public static void main(String[] args) {
        int arr[] = { 3, 22, 122, 4333, 5 };

        System.out.println(largest(arr));
    }

    // ? Functions
    static int largest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

//? Time Complexity = O(n)
