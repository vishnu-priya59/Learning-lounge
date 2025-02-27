//local variables are stored inside a method within a class
//Instance variables are stored outside a method within a class

public class Car {
    public String colour;

    Car(String c) {
        colour = c;
    }

    public void display() {
        System.out.println("The colour of the car is " + colour);
    }

    public static void main(String[] args) {
        Car obj = new Car("black");
        obj.display();

    }
}


/*Class(or)static variables are one copy that is shared by all the different objects in a class.
public class Car{
    public static int tyres;
    public static void Multithreading.Main(String[] args){
        tyres=4;
        System.out.println("Number of tyres "+tyres);
    }
}*/

