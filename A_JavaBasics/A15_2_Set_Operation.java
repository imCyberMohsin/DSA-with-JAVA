//? 2. Set Operation Coding...
//? Q. Set the 2nd bit(Positon=1) of number n. (n=0101) 
//?    Bit Mask: 1 << i
//?    Operation: OR    

public class A15_2_Set_Operation {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);  
        // It will give the Decimal number after setting  the bit at the given postion.
    }
}
