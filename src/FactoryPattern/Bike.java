package FactoryPattern;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Im in Bike");
    }
}
