package DecoratorPattern;

public class SimplePizza implements Pizza{

    @Override
    public String getdescription() {
        return "Simple Pizza";
    }

    @Override
    public double getCost() {
        return 50;
    }

}
