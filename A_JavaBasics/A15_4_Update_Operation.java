//? 4. Update Operation Coding...
/* 
?   Q. Update the 2nd bit(Positon=1) of number to 1. (n=0101) 
*   For 0:
    Bit Mask: 1 << i
    Operation: AND with NOT 
    
*   For 1:
    Bit Mask: 1 << i
    Operation: OR   
 */

import java.util.*;

public class A15_4_Update_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 = Set, 0 = Clear
        System.out.print("Choose bit to Update, (0 / 1)? ");
        int operation = sc.nextInt();
        int n = 5; // 0101
        System.out.print("Enter The Position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        if (operation == 1) {
            // set Operation : at pos=1, 5(0101) will become 7(0111)
            int newOper = bitMask | n;
            System.out.println(newOper);
        } else {
            // clear Operation :at pos=2, 5(0101) will become 1(0001)
            int newBitmask = ~(bitMask);
            int andOperation = (newBitmask & n);
            System.out.println(andOperation);
        }

        sc.close();
    }
}
