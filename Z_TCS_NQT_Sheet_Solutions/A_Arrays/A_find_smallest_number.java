//! Find the smallest number in an array 

public class A_find_smallest_number {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        System.out.println(smallest(arr));
    }

    // Function
    public static int smallest(int arr[]) {
        int smallest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
