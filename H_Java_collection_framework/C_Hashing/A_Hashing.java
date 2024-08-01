//! Hashing in Java
/*
 * 1. **Introduction**:
 *    - Hashing is a technique used to efficiently store and retrieve data.
 *    - It involves using a hash function to convert keys into indices in a hash table.
 * 
 * 2. **Hash Function**:
 *    - A hash function takes an input (or key) and returns a fixed-size string of bytes.
 *    - It maps the input to a specific index in a hash table.
 *    - The goal is to distribute the keys uniformly across the table to minimize collisions.
 * 
 * 3. **Hash Table**:
 *    - A hash table is an array of buckets or slots where each bucket stores a key-value pair.
 *    - The index of the bucket is determined by the hash code of the key.
 *    - Buckets can handle collisions using techniques such as chaining or open addressing.
 * 
 * 4. **Hash Code**:
 *    - In Java, the `hashCode()` method is used to generate a hash code for an object.
 *    - The hash code is an integer that is used by the hash function to determine the bucket index.
 *    - The `hashCode()` method should be overridden to ensure that objects with equal values have the same hash code.
 * 
 * 5. **Collision Handling**:
 *    - **Chaining**: Uses linked lists to store multiple key-value pairs in the same bucket. When a collision occurs, the new entry is added to the list at the bucket index.
 *    - **Open Addressing**: Finds another open bucket in the hash table when a collision occurs. Common techniques include linear probing, quadratic probing, and double hashing.
 * 
 * 6. **Java Collections and Hashing**:
 *    - **HashMap**: Uses hashing to store key-value pairs and handle collisions. Provides O(1) average time complexity for `put()`, `get()`, and `remove()` operations.
 *    - **HashSet**: Implements the `Set` interface using a hash table to store unique elements. It uses hashing to ensure that duplicate elements are not added.
 *    - **Hashtable**: An older class similar to `HashMap` but synchronized, which means it is thread-safe but slower. It has largely been replaced by `HashMap` in most use cases.
 * 
 * 7. **Best Practices**:
 *    - Ensure that the `hashCode()` method is implemented consistently with the `equals()` method.
 *    - Choose a good hash function to minimize collisions and distribute keys uniformly.
 *    - Be aware of performance trade-offs between different collision handling techniques.
 */