package DecoratorPattern;

public class CapsicumToppings extends PizzaDecorator{
   public CapsicumToppings(Pizza pizza){
       super(pizza);
   }

    public double getCost() {
        return super.getCost()+30;
    }

    public String getdescription(){
        return super.getdescription()+"CapsicumToppings";
    }



}
