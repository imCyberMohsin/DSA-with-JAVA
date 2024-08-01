//! Internal Implementation of HashMap in Java
/*
 * 1. **Introduction**:
 *    - `HashMap` is a part of the Java Collections Framework and implements the `Map` interface.
 *    - It uses a hash table to store key-value pairs.
 *    - It allows null values and one null key.
 * 
 * 2. **Internal Data Structure**:
 *    - **Hash Table**: Internally, `HashMap` uses an array of `Node` objects (or `Entry` objects in some implementations) to store the key-value pairs.
 *    - **Buckets**: The array is divided into buckets (or slots), where each bucket is a Array of linked list (or tree, starting from Java 8) of `Node` objects.
 *    - **Hash Function**: The hash function is used to compute the bucket index for a given key. This ensures the key-value pairs are distributed across the buckets.
 * 
 * 3. **Key Operations**:
 *    - **Adding Elements**: 
 *      - Compute the hash code of the key and determine the bucket index.
 *      - Insert the key-value pair into the appropriate bucket.
 *      - If there is a collision (i.e., another entry with the same bucket index), handle it by linking the new entry to the existing entries in the bucket (collision resolution via chaining).
 *    - **Retrieving Elements**:
 *      - Compute the hash code of the key to find the bucket.
 *      - Traverse the bucket (linked list or tree) to find the entry with the matching key and return its value.
 *    - **Removing Elements**:
 *      - Compute the hash code of the key and find the bucket.
 *      - Traverse the bucket to find the entry with the matching key.
 *      - Remove the entry from the linked list or tree and re-link the remaining entries.
 * 
 * 4. **Collision Handling**:
 *    - **Chaining**: In Java's `HashMap`, collisions are handled using linked lists in each bucket.
 *    - **Treeification**: Starting from Java 8, if a bucket's linked list becomes too long (threshold of 8 by default), it is converted into a balanced tree (red-black tree) for better performance.
 * 
 * 5. **Load Factor and Rehashing**:
 *    - **Load Factor**: Determines when to resize the hash table. Default load factor is 0.75, meaning the hash table will be resized when 75% of the buckets are filled.
 *    - **Rehashing**: Involves creating a new, larger hash table and reassigning all existing entries to the new table based on their hash codes. This operation helps maintain efficient performance as the number of entries grows.
 * 
 * 6. **Performance**:
 *    - **Time Complexity**: Average time complexity for operations like `put()`, `get()`, and `remove()` is O(1). In the worst case (e.g., all keys hash to the same bucket), time complexity can degrade to O(n), but this is rare due to effective hash functions and treeification.
 *    - **Space Complexity**: Space complexity is O(n) where n is the number of key-value pairs stored in the `HashMap`.
 * 
 * 7. **Example**:
 *    - An example demonstrating the creation of a `HashMap`, adding key-value pairs, retrieving values, and handling collisions would help illustrate how `HashMap` operates internally.
*/