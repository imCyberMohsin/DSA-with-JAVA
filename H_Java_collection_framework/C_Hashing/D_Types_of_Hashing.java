//! Types of Hashing:
/**
 * 1. **Modulo-Division Hashing**:
 *    - Uses the modulo operation to map a large key space into a smaller range.
 *    - **Technique**: 
 *      - The key is divided by the table size, and the remainder is used as the hash address.
 *      - This method is simple and effective, especially if the table size is a prime number.
 *    - Example: hash(key) = key % table_size
 *    - **Advantages**:
 *      - Easy to compute.
 *      - Distributes keys uniformly if the table size is chosen correctly.
 *    - **Disadvantages**:
 *      - Can lead to clustering if the table size is not chosen properly.
 * 
 * 2. **Mid-Square Method**:
 *    - Squares the key and then extracts the middle part of the result to form the hash address.
 *    - **Technique**:
 *      - The key is squared, and a portion from the middle of the squared number is used as the hash address.
 *      - This method spreads out the values more uniformly.
 *    - Example: If the key is 123, square it (123^2 = 15129), and use the middle part (512) as the hash address.
 *    - **Advantages**:
 *      - Provides good distribution of keys.
 *      - Less sensitive to patterns in the input data.
 *    - **Disadvantages**:
 *      - More computationally intensive due to squaring operation.
 * 
 * 3. **Folding Method**:
 *    - Breaks the key into smaller parts and combines them to form the hash address.
 *    - **Technique**:
 *      - The key is divided into equal-sized parts.
 *      - These parts are added together to produce the hash address.
 *      - Variations include folding by adding, folding by shifting, and folding by boundary.
 *    - Example: For a 9-digit key, break it into three 3-digit parts and sum them up.
 *    - **Advantages**:
 *      - Simple to implement.
 *      - Effective for numerical keys.
 *    - **Disadvantages**:
 *      - Can be less effective if the key parts are not uniformly distributed.
 *      - Sensitive to the choice of partitioning.
 */