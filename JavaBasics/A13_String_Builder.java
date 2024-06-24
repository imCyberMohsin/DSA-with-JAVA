//? String Builder in Java.
//? It is used to make Strings mutable.

public class A13_String_Builder {
    public static void main(String[] args) {

        // Creating String Builder Object
        StringBuilder sb = new StringBuilder("Mohsin");
        System.out.println(sb);

        // charAt index 0
        System.out.println("Index[0] = " + sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'O');
        System.out.println("setCharAt = " + sb);

        // Insert
        sb.insert(0, 'M');
        System.out.println("After Insert = " + sb);

        // Delete
        sb.delete(1, 2);
        System.out.println("After Delete = " + sb);

        // Append (means adding at end)
        sb.append(" ");
        sb.append("Ansari");
        System.out.println("After Append = " + sb);

        // Length
        System.out.println("Length = " + sb.length());

        // ! Question: Reverse A String. Eg: hello = olleh
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = 4 , 'h' will be place at 4th index

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reveresed String: " + sb);

        // Time Complexity : O(n)
    }
}
