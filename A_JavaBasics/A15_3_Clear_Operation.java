//? 3. Clear Operation Coding...
//? Q. Clear the 3rd bit(Positon=2) of number n. (n=0101) 
//?    Bit Mask: 1 << i
//?    Operation: AND with NOT    

public class A15_3_Clear_Operation {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        int not = ~(bitMask);
        int and = (not & n);
        // Given Positon will be cleard. and give the decimal output after the clear operation.
        // Here, 5(0101) becomes 1(0001), after clear operation.
        System.out.println(and);  
    }
}
