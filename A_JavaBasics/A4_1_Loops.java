//! Loops: Iterate a block of code or functionality within a given condition.
//! Types of Loops; for, while, do-while 

public class A4_1_Loops {
    public static void main(String[] args) {

        //? 1. for Loops
        // Print HelloWorld 5 times
        System.out.println("'HelloWorld' 5 times using for loop.");
        for (int i=1; i<=5; i++){
            System.out.println("HelloWorld");
        }

        // Print 0 to 10
        System.out.println("\nPrinting 0 to 10 Using for loop.");
        for(int i=0; i<=10; i++){
            System.out.print(i+" ");
        }


        //? 2. While Loops
        // Print 1 to 10
        System.out.println("\n\nPrinting 1 to 10 using while loop.");
        int j=1;                    // Initialization
        while (j<11){               // Termination condition
            System.out.print(j+" ");
            j++;                    // Increment
        }

        //? 3. do While loops
        //?    do-while will execute at least once whether the condition is true or false.
        // Print 1 to 10 using do while loop
        System.out.println("\n\nPrinting 1 to 10 using do while loop");
        int k = 1;                      // Initialization
        do{
            System.out.print(k+" ");
            k++;                        // Increment
        } while(k < 11);                // Termination
    }
}
