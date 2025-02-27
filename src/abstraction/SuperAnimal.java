package abstraction;

public class SuperAnimal {
    String name = "Animal";

    public void printName() {
        System.out.println(name);
    }

    static class Dog extends SuperAnimal {
        String name = "Dog";

        @Override
        public void printName() {
            super.printName();
            System.out.println(name);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.printName();

        }
    }
}
