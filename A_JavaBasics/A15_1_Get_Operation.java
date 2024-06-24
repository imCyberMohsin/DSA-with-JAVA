//? 1. Get Operation Coding...
//? Q. Get the 3rd bit(Positon=2) of number n. (n=0101) 
//?    Bit Mask: 1 << i
//?    Operation: AND    

public class A15_1_Get_Operation {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Position " + pos + " bit is '0'");
        } else {
            System.out.println("Position " + pos + " bit is '1'");
        }
    }
}
