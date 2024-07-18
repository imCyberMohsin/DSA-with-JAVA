//! Merge Sort Algorithm : Divide & Merge
// It is an algorithm where the array is divided into hypothetical halves until 1 element is left.
// Then we create a temp array
// Compere the elements of left and write and push the lower element to the temp array till all elements are pushed or exhausted.
// Finally, we move all the elements from temp array to the original array.

public class D_Merge_sort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 12, 0, 0 };
        int low = 0; // Start Index
        int high = arr.length - 1; // End Index
        // System.out.println(high);
        mergeSort(arr, low, high);
        print(arr);
    }

    // ? Functions
    // * Merge Sort function
    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) { // Base case
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid); // Split left
        mergeSort(arr, mid + 1, high); // SPlit right
        merge(arr, low, mid, high); // Merge Left and Right
    }

    // * Merge
    // In merge we'll have 2 pointers pointing to the start of Left and Right
    private static void merge(int arr[], int low, int mid, int high) {
        int newArr[] = new int[high - low + 1];
        int leftPtr = low;
        int rightPtr = mid + 1;
        int i = 0;

        // storing elements in the temporary array in a sorted manner
        while (leftPtr <= mid && rightPtr <= high) {
            // compare left and right elements (if left element is lesser)
            if (arr[leftPtr] <= arr[rightPtr]) {
                newArr[i] = arr[leftPtr];
                i++;
                leftPtr++;
            } else {
                // Right element is lesser
                newArr[i] = arr[rightPtr];
                rightPtr++;
                i++;
            }
        }

        // If any one half got exhausted, and the other have elements
        // For Left Part
        while (leftPtr <= mid) {
            newArr[i++] = arr[leftPtr++];
        }
        // For Right Part
        while (rightPtr <= high) {
            newArr[i++] = arr[rightPtr++];
        }

        // Copy back all the elements from newArr to arr
        for (int j = 0; j < newArr.length; j++) {
            arr[low + j] = newArr[j];
        }
    }

    // * Print Array
    private static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//? Time Complexity: O(N log N)
// we are dividing the array into half untill 1 element is left so its time complexity will O(log base2 N)
// Merge function time complexity will be O(N), where N is the number of elements.
// Final Time Complexity: O(N log N)

//? Space Complexity: O(N)
// The extra space required by temporary Array will be O(N), because it stores all the elements of the array during merge.
// So, The temporary Array depends on the size of the original array, so space complexity will be O(N) 