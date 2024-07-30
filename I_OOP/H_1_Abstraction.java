//! Abstraction
// We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details. 
// In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.

//* Abstraction is achieved in 2 ways :
//? 1. Abstract class
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.

//? 2. Interfaces (Pure Abstraction)



// It is unnecessary to show this Animal class to user
// So we make it abstract class
// Now, Object of this Animal class cannot be created and accessed
abstract class Animal {
    abstract public void walk();

    Animal(){
        System.out.println("Creating new Animal");
    }

    public void eat(){
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class H_1_Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
