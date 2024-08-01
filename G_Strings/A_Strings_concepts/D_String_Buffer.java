//! StringBuffer in Java
// The StringBuffer class in Java is used to create mutable strings, allowing modification of string content without creating new objects each time.
// Unlike Strings, which are immutable, StringBuffer can be changed without creating new instances. 
//? It is Similar to StringBuilder with few differences:
/*
 * Differences between StringBuffer and StringBuilder:
 * 1. **Thread Safety**:
 *    - **StringBuffer**: Synchronized, thread-safe. Suitable for multi-threaded scenarios where
 *      multiple threads may access and modify the same instance.
 *    - **StringBuilder**: Not synchronized, not thread-safe. Generally preferred for single-threaded
 *      scenarios due to better performance.
 *
 * 2. **Performance**:
 *    - **StringBuffer**: May have slightly lower performance due to synchronization overhead.
 *    - **StringBuilder**: Faster than StringBuffer in single-threaded contexts because it does not
 *      have synchronization overhead.
 *
 * 3. **Usage**:
 *    - **StringBuffer**: Use when thread safety is required.
 *    - **StringBuilder**: Use when thread safety is not a concern, and better performance is needed.
 *
 * 4. **API**:
 *    - Both classes offer similar methods, such as `append()`, `insert()`, `delete()`, `replace()`,
 *      `reverse()`, and methods to get length and capacity.
*/

public class D_String_Buffer {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf.toString()); // Output: Hello World
    }
}
