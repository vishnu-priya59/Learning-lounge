package DecoratorPattern;

public class NonvegToppings extends PizzaDecorator{


    public NonvegToppings(Pizza pizza) {
        super(pizza);
    }

    public double getCost() {
        return super.getCost()+100;
    }

    public String getdescription(){
        return super.getdescription()+" NonVegToppings";
    }
}
