//! 2. Interfaces (Pure Abstraction) 
// All the fields in interfaces are public, static and final by default.
// All methods are public & abstract by default.
// A class that implements an interface must implement all the methods declared in the interface.
// Interfaces support the functionality of multiple inheritance.


interface Animal{
    void walk();
    // void eat();
}
interface Herbivore{

}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class H_2_Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}