//! HashSet in Java 
/*
 * 1. **What is HashSet?**:
 *    - `HashSet` is part of the Java Collections Framework.
 *    - It implements the `Set` interface and uses a hash table for storage.
 *    - It does not allow duplicate elements.
 * 
 * 2. **Features**:
 *    - **Unordered**: The elements in a `HashSet` are not ordered.
 *    - **Unique Elements**: It only stores unique elements.
 *    - **Null Values**: It allows one null value.
 *    - **Constant Time Operations**: Basic operations like add, remove, and contains have constant time complexity, O(1).
 * 
 * 3. **Usage**:
 *    - **Adding Elements**: Use the `add()` method to add elements.
 *    - **Removing Elements**: Use the `remove()` method to remove elements.
 *    - **Checking for Elements**: Use the `contains()` method to check if an element exists.
 *    - **Size**: Use the `size()` method to get the number of elements.
 *    - **Clear**: Use the `clear()` method to remove all elements.
*/

import java.util.HashSet;
import java.util.Iterator;

public class A_HashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Insert/Add elements
        set.add(1);
        set.add(2);
        set.add(3);
        // Trying to add a duplicate element (will not be added)
        set.add(1);

        // Printing HashSet
        System.out.println("HashSet: " + set);

        // Search element
        System.out.println("Contains 1 = " + set.contains(1));

        // Removing an element from the HashSet
        set.remove(3);
        System.out.println("Removed 3 = " + set);

        // Iterating over the elements in the HashSet
        System.out.print("Iterating over HashSet: ");
        for (int i : set) {
            System.out.print(i + " ");
        }

        // Iterator
        // next() : contains the next element
        // hasNext() : returns true if iterator has the next element, else returns false
        Iterator it = set.iterator();
        System.out.println("\n\nIterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Checking the size of the HashSet
        System.out.println("\nSize of set = " + set.size());

        // Clearing all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}