//! Count the frequency of char in String using hashMap 
import java.util.HashMap;

public class D_Frequency_of_char_using_HashMap {
    public static void main(String[] args) {
        String str = "Mohsin Ansari";
        int n = str.length();
        char c  = 'i';

        count(str, n, c);
    }

    // ! Function to count
    static void count(String str, int n, char c) {
        // Precomputing OR Hashing
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        // Fetch frequency
        if (map.containsKey(c)) {
            System.out.println(map.get(c));
        } else {
            System.out.println("Char not found");
        }
    }
}
