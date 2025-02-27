package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Pizza c1 = new SimplePizza();
        System.out.println(c1.getCost());
        Pizza SimplePizza=new SimplePizza();
        Pizza c2 = new NonvegToppings(SimplePizza);
        System.out.println(c2.getdescription());
        c1.getCost();


    }

}
