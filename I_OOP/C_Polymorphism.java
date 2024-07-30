//! Polymorphism
// Poly means 'many' and morphism means 'forms'. 

//? Types of Polymorphism
//*  1. Compile Time Polymorphism(Static)
//      The polymorphism which is implemented at the compile time is known as compile-time polymorphism. 
//      Example - Method Overloading 
/*
    Method Overloading: 
    Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. 
    Method overloading can be possible on the following basis: 
        1. The type of the parameters passed to the function. 
        2. The number of parameters passed to the function. 
*/

//* 2. Runtime Polymorphism(Dynamic)
// Implemented during the runtime
// Function overriding is an example of runtime polymorphism.
/* 
    Function overriding:
    Function overriding means when the child class contains the method which is already present in the parent class. 
    Hence, the child class overrides the method of the parent class.
 */

//! Polymorphism using method overloading 
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("\nName = " + this.name);
    }

    public void printInfo(int age) {
        System.out.println("\nAge = " + this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println("\nName = " + this.name);
        System.out.println("Age = " + this.age);
    }
}

public class C_Polymorphism {
    public static void main(String[] args) {
        // 1
        Student s1 = new Student();
        s1.name = "Mohsin";
        s1.age = 24;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}