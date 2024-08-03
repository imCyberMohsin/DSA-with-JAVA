//! Count the number of occurances of an element
// Find the first and last occurance in the sorted array
// Now find the count, count = (lastOccIndex - firstOccIndex)+1

public class B_No_of_occurance {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3 };
        int n = arr.length;
        int num = 1;

        // System.out.println(firstOcc(arr, n, num));
        // System.out.println(lastOcc(arr, n, num));
        System.out.println(count(arr, n, num));
    }

    static int firstOcc(int arr[], int n, int num) {
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        int result = -1;

        while (start <= end) {
            if (arr[mid] == num) {
                result = mid;
                end = mid - 1;
            }

            if (num > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }

    static int lastOcc(int arr[], int n, int num) {
        int start = 0;
        int end = n - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                result = mid;
                start = mid + 1;
            }

            if (num > arr[mid]) {
                start = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }

    // Count Occurance
    static int count(int arr[], int n, int num) {
        int last = lastOcc(arr, n, num);
        int first = firstOcc(arr, n, num);

        int occurance = (last - first) + 1;

        if (first == -1 || last == -1) {
            return 0;
        }
        return occurance;
    }
}
