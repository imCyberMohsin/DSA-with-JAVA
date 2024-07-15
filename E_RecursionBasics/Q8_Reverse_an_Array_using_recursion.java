//! Reverse an array using recursion

public class Q8_Reverse_an_Array_using_recursion {
    private static void swap(int arr[], int ptrLeft, int ptrRight) {
        int temp = arr[ptrLeft];
        arr[ptrLeft] = arr[ptrRight];
        arr[ptrRight] = temp;
    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // * Two Pointer Approach
    public static void reverseArr1(int arr[], int ptrLeft, int ptrRight) {
        if (ptrLeft >= ptrRight) {
            return;
        }
        swap(arr, ptrLeft, ptrRight);
        reverseArr1(arr, ptrLeft + 1, ptrRight - 1);
    }

    // * One Pointer Approach
    public static void reverseArr2(int arr[], int ptr) {
        if (ptr >= arr.length / 2) {
            return;
        }
        swap(arr, ptr, arr.length - ptr - 1);
        reverseArr2(arr, ptr + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 9, 6 };
        int arr2[] = { 1, 6, 3, 9, 8 };

        //* 1: Two Pointer Approach
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Reversed Array:");
        reverseArr1(arr, 0, arr.length - 1);
        printArray(arr);

        System.out.println("\n---------------------------");

        //* 2: One Pointer Approach
        System.out.println("Original Array:");
        printArray(arr2);
        System.out.println("Reversed Array:");
        reverseArr2(arr2, 0); // Corrected the initial pointer to 0
        printArray(arr2);
    }
}
