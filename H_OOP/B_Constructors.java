//! Constructors
/* 
Constructor is a special method which is invoked automatically at the time of object creation. 
It is used to initialize the data members of new objects generally. 
    - Constructors have the same name as class or structure. 
    - Constructors don’t have a return type. (Not even void)
    - Constructors are only called once, at object creation.

There can be three types of constructors in Java:
    1. Non-Parameterized constructor : 
        A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). 
        It is invoked at the time of creating an object. 
        If we don’t create one then it is created by default by Java.

    2. Parameterized constructor : 
    Constructor which has parameters is called a parameterized constructor. 
    It is used to provide different values to distinct objects. 

    3. Copy Constructor : 
        A Copy constructor is an overloaded constructor used to declare and initialize an object from another object. 
        Overloaded constructor means method having same name as the class name.

*/

// Student class(Blueprint)
class Student {
    String name;
    int age;

    public void printName() {
        System.out.println("\nName = " + this.name);
        System.out.println("Age = " + this.age);
    }

    // 1. Non-Parameterized Constructor
    Student() {
        System.out.println("Constructor called");
    }

    // 2. Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3.
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class B_Constructors {
    public static void main(String[] args) {
        // 1.
        // Student student1 = new Student();

        // 2.
        Student student1 = new Student("Mohsin", 24);
        student1.printName();

        // 3.
        Student student2 = new Student(student1);
        student2.printName();
    }
}

// ? Note :
// Unlike languages like C++, Java has no Destructor.
// Instead, Java has an efficient garbage collector that deallocates memory automatically.