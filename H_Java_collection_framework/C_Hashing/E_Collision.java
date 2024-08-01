//? Collision in Hashing:
/**
 * 
 * A collision occurs when two distinct keys hash to the same index in a hash table.
 * This happens because the hash function maps a potentially large set of input keys to a smaller set of hash values (indices).
 * 
 * **Handling Collisions**:
 * 1. **Chaining**:
 *    - **Technique**: Each slot in the hash table points to a linked list (or another data structure) 
 *      that holds all the keys that hash to the same index.
 *    - **Implementation**:
 *      - When a collision occurs, the new key is added to the linked list at the appropriate index.
 *      - To search for a key, traverse the linked list at the hash index.
 *    - **Advantages**:
 *      - Simple to implement.
 *      - Can handle an unlimited number of collisions gracefully.
 *    - **Disadvantages**:
 *      - Requires additional memory for pointers in the linked list.
 *      - Performance can degrade if many collisions occur, leading to long linked lists.
 * 
 * 2. **Open Addressing**:
 *    - **Technique**: All elements are stored in the hash table itself, and collisions are resolved by probing 
 *      (searching for another empty slot in a defined sequence).
 *    - **Common Methods**:
 *      - **Linear Probing**: If a collision occurs at index `i`, try the next slot `(i+1) % table_size`, 
 *        then `(i+2) % table_size`, and so on.
 *      - **Quadratic Probing**: Use a quadratic function to determine the sequence of slots to try.
 *      - **Double Hashing**: Use a second hash function to determine the step size for probing.
 *    - **Advantages**:
 *      - Avoids the need for additional data structures.
 *      - Generally good cache performance due to locality of reference.
 *    - **Disadvantages**:
 *      - Clustering: Consecutive keys can form clusters, leading to more collisions.
 *      - Performance degrades as the hash table becomes full.
 * 
 * 3. **Double Hashing**:
 *    - **Technique**: Uses a secondary hash function to calculate the interval between probes, reducing clustering 
 *      compared to linear and quadratic probing.
 *    - **Implementation**:
 *      - If a collision occurs, compute a new index using a second hash function and add this interval to the original index.
 *      - Continue probing until an empty slot is found.
 *    - **Advantages**:
 *      - Reduces clustering compared to linear probing.
 *      - Can be more efficient than other open addressing methods.
 *    - **Disadvantages**:
 *      - More complex to implement.
 *      - Requires careful choice of the second hash function.
*/