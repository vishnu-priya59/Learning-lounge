package Polymorphism;
//Method overloading is multiple constructors
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();
        Circle circle = new Circle();
        circle.area();
        Triangle triangle = new Triangle();
        triangle.area();
    }
}
