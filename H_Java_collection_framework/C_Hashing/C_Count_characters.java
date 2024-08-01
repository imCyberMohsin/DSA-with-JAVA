//! Count each character of a string (Hashing using array) 

public class C_Count_characters {
    public static void main(String[] args) {
        String str = "Mohsin Ansari";
        char c = 'i';
        int n = str.length();

        // Hashing
        int hash[] = new int[128];
        for (int i = 0; i < n; i++) {
            hash[str.charAt(i)]++;
        }

        // Fetch the count
        System.out.println(hash[c]);
    }
    //? Time complexity : O(n) 
    //? Space complexity : O(1) 
}