//! 2.Output, Variables & Datatypes in Java.

//? Output: We get output using the print/println function.
//?         println works as \n or newline.
//* Variables: Variables are the containers in the memory which stores values or data. 
//*             Variables don't have fixed values. Eg: a, b, c
//* Constants: Whose value don't change. Eg: 4, 5, 6
//? Datatypes: The type of the variables. Two Types of Datatypes in Java..
//?            Primitive: int, char, float, double, long, byte, short, boolean
//?            Non-Primitive: String, Array, Class, Object, Interface

class A2_1_Variables {
    public static void main(String[] args) {

        // ? Output.
        System.out.println("This is an output and a New Line.");
        System.out.print("This is an output.");
        System.out.print("\nLine1\nLine2\n\n");

        /*
         * Print The Pattern
         *
         **
         ***
         ****
         */
        System.out.println("Pattern Printing");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // ? Variables & Datatypes
        String name = "Mohsin"; // "name" is a variable of String datatype
        int a = 5; // "a" is a variable of integer datatype
        int b = 2;
        int age = 22;
        double salary = 30000; // "salary" is a variable of double datatype
        // float price = 350.50f; // "price" is a variable of float datatype

        // We can change the values of the variables.
        age = 23;
        salary = 40000;

        System.out.println("\nHii I'm " + name + " and I'm " + age + "My Salary is " + salary);

        int sum = a + b;
        System.out.println("Sum of a+b = " + sum);
        System.out.print("diff of a-b = " + (a - b));

        // Learn Operator Precedence
    }
}