package abstraction;

public abstract class AbstractAnimal {
    abstract void sound();


     static class Dog extends AbstractAnimal {
         void sound(){
             System.out.println("bow bow");
         }

    }

    class Cat extends AbstractAnimal{
         void sound(){
             System.out.println("meow meow");
         }
    }

    public static void main(String[] args) {
        AbstractAnimal dog = new Dog();
        dog.sound();

    }

}
