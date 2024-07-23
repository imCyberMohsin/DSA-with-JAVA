//! Single Inheritance

// Parent class / Base class
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
// Child class / Derived class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

public class D_2_Single_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 3);
    }
}