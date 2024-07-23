//! Object Oriented Programming 
// Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. 
// It simplifies the software development and maintenance by providing some concepts defined below:

//? Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated. 
//? Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item. An object can operate on both data members and member functions. 

//? 4 Pillars of OOP;
// 1. Abstration
// 2. Inheritance
// 3. Polymorphism
// 4. Encpsulation 

// 1. Custom class(Blueprint)
class Pen {
    String color;
    String type;

    // functions of Pen
    public void write() {
        System.out.println("Writing...");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}

// Student class(Blueprint)
class Student {
    String name;
    int age;

    public void printName() {
        System.out.println("\nName = " + this.name);
        System.out.println("Age = " + this.age);
    }
}

// Main class
public class A_OOP_basics {
    public static void main(String[] args) {
        // 2. Create object for Pen
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.write();
        pen2.printColor();

        Student student1 = new Student();
        student1.name = "Mohsin";
        student1.age = 24;
        student1.printName();
    }
}

//? 'new' keyword :
// Note : When an object is created using a new keyword, then space is allocated for the variable in a heap, 
// and the starting address is stored in the stack memory.

//? 'this' keyword :  
// 'this' keyword in Java that refers to the current instance of the class. In OOPS it is used to: 
// pass the current object as a parameter to another method 
// refer to the current class instance variable
