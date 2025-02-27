package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        FactoryVehicle factoryVehicle = new FactoryVehicle();
        Vehicle car=factoryVehicle.getvehicle("Car");
        car.drive();
    }
}
