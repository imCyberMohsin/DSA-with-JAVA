//! Inheritance
// Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. 
// In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 
// In Java, the class which inherits the members of another class is called derived class 
// and the class whose members are inherited is called base class. 
// Inheritance promotes reusability.

//* Types of Inheritance
// 1. Single inheritance : When one class inherits another class, it is known as single level inheritance 
// 2. Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 
// 3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class. 
// 4. Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 


// Parent class / Base class
class Shape{
    String color;
}
// Child class / Derived class
class Triangle extends Shape{

}

public class D_1_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}