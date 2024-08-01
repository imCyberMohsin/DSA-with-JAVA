//! HashMap in Java 
/*
 * 1. **What is HashMap?**:
 *    - `HashMap` is part of the Java Collections Framework.
 *    - It implements the `Map` interface and uses a hash table for storage.
 *    - It stores key-value pairs and allows fast retrieval based on the key.
 *    - The Key is always unique, the value may be same.
 * 
 * 2. **Features**:
 *    - **Unordered**: The elements in a `HashMap` are not ordered.
 *    - **Null Values and Keys**: It allows one null key and multiple null values.
 *    - **Constant Time Operations**: Basic operations like put, get, and remove have constant time complexity, O(1).
 * 
 * 3. **Usage**:
 *    - **Adding Elements**: Use the `put()` method to add key-value pairs.
 *    - **Checking for Elements**: Use the `containsKey()` and `containsValue()` methods to check if a key or value exists.
 *    - **Removing Elements**: Use the `remove()` method to remove key-value pairs.
 *    - **Size**: Use the `size()` method to get the number of key-value pairs.
 *    - **Clear**: Use the `clear()` method to remove all key-value pairs.
 */

import java.util.HashMap;
import java.util.Map;

public class A_HashMap {
    public static void main(String[] args) {
        // ? 1. Creating a HashMap
        // country(Key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // ? 2. Insert key-value
        map.put("India", 120);
        map.put("USA", 40);
        map.put("China", 130);

        // Print Map
        System.out.println("Printing = " + map);

        // Updating values
        map.put("China", 140);
        System.out.println("Updated China = " + map);

        // ? 3. Searching
        // Search Key
        System.out.println("\nSearching Key...");
        if (map.containsKey("China")) {
            System.out.println("Key is Found");
        } else {
            System.out.println("Key Not Found");
        }

        // Search Value of Key
        System.out.println("\nSearching Value...");
        if (map.containsValue(120)) {
            System.out.println("Value Found");
        } else {
            System.out.println("Value Not found");
        }

        // Get value using key
        System.out.println();
        System.out.println(map.get("China"));
        System.out.println(map.get("AFG"));

        // ? 4. Traverse HashMap
        System.out.println("\nTraversing HashMap...");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //? 5. Remove key-value pairs
        map.remove("China");
        System.out.println("\nRemoved China = "+ map);

        //? 6. Size
        System.out.println("\nSize = "+ map.size()); 

        //? 7. Clear 
        map.clear();
        System.out.println();
        System.out.println("Removed all key-value pairs : "+ map); 
    }
}