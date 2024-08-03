//! Find the smallest number in an array
/* 
    Logic 1: 
        Sort the array in ascending order
        then, the last element will be the largest

    Logic 2:
        Take first element as the largest 
        now iterate the whole array by comparing if greater element is found
        If greater element is found update the largest to that element.
 */

public class A_Largest_element {
    public static void main(String[] args) {
        int arr[] = { 2, 33, 443, 1, 0, -1 };

        System.out.println(bruteforce(arr));
        System.out.println(optimal(arr));
    }

    //? 1. Bruteforce approach
    // Time complexity: O(n^2)
    // Sort the array in ascending orders and then the last element will be the largest
    static int bruteforce(int arr[]) {
        // Sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        int largest = arr[arr.length - 1];
        return largest;
    }

    //? 2. Optmial Approach
    // Time complexity : O(n)
    // Take first element as the largest and compare with all the elements, if larger element is found then update it as the largest.  
    static int optimal(int arr[]){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
