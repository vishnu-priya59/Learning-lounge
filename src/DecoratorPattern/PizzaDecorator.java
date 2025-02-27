package DecoratorPattern;

public class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }


    @Override
    public String getdescription() {
        return pizza.getdescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
