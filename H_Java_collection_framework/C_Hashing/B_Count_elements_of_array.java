//! Count the occurance of an element (Hashing using array) 
public class B_Count_elements_of_array {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 3 }; // Array of elements
        int num = 3; // Element to count occurrences of

        // Computing hash/count and storing in the hash array
        int hash[] = new int[13];
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            // Setting the count in the hash array for each element
            hash[currentElement]++;
            /*
                Iteration 1 (i = 0):
                arr[0] is 1
                Increment hash[1] by 1 : hash[1] += 1
                hash array now: hash = [0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

                Iteration 2 (i=1):
                arr[1] is 3
                Increment hash[3] by 1 : hash[3] += 1
                hash array now: hash = [0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]

                Iteration 3 (i=2):
                arr[2] is 2
                Increment hash[2] by 1 : hash[2] += 1
                hash array now: hash = [0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]

                Iteration 4 (i=3):
                arr[3] is 1
                Increment hash[1] by 1 : hash[1] += 1
                hash array now: hash = [0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
            
                Iteration 5 (i=4):
                arr[4] is 3
                Increment hash[3] by 1 : hash[3] += 1
                hash array now: hash = [0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0]
             */
        }

        // Fetch the count of the specific element from the hash array
        System.out.println(hash[num]);
    }
}