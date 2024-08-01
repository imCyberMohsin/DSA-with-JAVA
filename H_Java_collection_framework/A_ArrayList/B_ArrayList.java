//! ArrayList 
/*
 * 1. **Introduction**:
 *    - `ArrayList` is a resizable array implementation of the `List` interface.
 *    - It is part of the Java Collections Framework and is found in the `java.util` package.
 *    - `ArrayList` allows for dynamic resizing, meaning it can grow or shrink as needed.
 *    - It stores elements in a dynamically sized array and provides indexed access to elements.
 * 
 * 2. **Features**:
 *    - **Dynamic Sizing**: Unlike arrays, `ArrayList` can grow or shrink as elements are added or removed.
 *    - **Indexed Access**: Provides constant-time access to elements using indices (O(1) time complexity for `get()` and `set()` operations).
 *    - **Non-Continuous Storage**: Internally, `ArrayList` uses an array that may be resized as needed. The elements themselves are stored in contiguous memory locations, but the array backing the list can be resized.
 *    - **Allows Duplicates**: Can store duplicate elements.
 *    - **Allows Null Values**: Can store null values.
 * 
 * 3. **Operations with ArrayLists**:
 *    - **Adding Elements**:
 *      - `add(E e)`: Adds the specified element to the end of the list.
 *      - `add(int index, E element)`: Inserts the specified element at the specified position in the list.
 *    - **Getting Elements**:
 *      - `get(int index)`: Returns the element at the specified position in the list.
 *    - **Modifying Elements**:
 *      - `set(int index, E element)`: Replaces the element at the specified position with the specified element.
 *    - **Deleting Elements**:
 *      - `remove(int index)`: Removes the element at the specified position in the list.
 *      - `remove(Object o)`: Removes the first occurrence of the specified element.
 *    - **Iterating**:
 *      - **For-Loop**: Use a for-loop to iterate over the elements.
 *      - **Enhanced For-Loop**: Use an enhanced for-loop (for-each) for iteration.
 *      - **Iterator**: Use the `Iterator` interface to traverse the list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class B_ArrayList {
    public static void main(String[] args) {
        // ? 1. Declare an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // ? 2. Add Elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // ? 3. Get Elements
        int element = list.get(2);
        System.out.println(element);

        // ? 4. Add item in between
        list.add(1, 11);
        System.out.println(list);

        // ? 5. Replace element
        list.set(3, 33);
        System.out.println(list);

        // ? 6. Remove element
        list.remove(3);
        System.out.println(list);

        // ? 7. Count size of list
        int size = list.size();
        System.out.println("Size = " + size);

        // ? 8. Looping
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // ? 9. Sorting
        Collections.sort(list);
        System.out.println("\n" + list);
    }
}
