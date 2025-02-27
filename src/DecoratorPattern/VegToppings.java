package DecoratorPattern;

public class VegToppings extends PizzaDecorator {

    public VegToppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    public String getdescription() {
        return super.getdescription() + "VegToppings";
    }
}
