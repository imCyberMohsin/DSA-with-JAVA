//! Hierarchial Inheritance

// Parent class / Base class
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
// 1st derived class from Shape
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
// 2nd derived class from Shape
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

public class D_4_Hierarchial_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 3);
    }
}