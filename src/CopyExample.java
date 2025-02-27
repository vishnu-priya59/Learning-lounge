public class CopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("India");
        Person person1 = new Person("vishnu",address);

        Person person2 = null;
        try {
            person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        person2.address.city="Banglore";

        Person person3 = person1.deepcopy();
        person3.address.city="Tekion";

        System.out.println(person1.address.city);
        System.out.println(person3.address.city);





    }
    static class Address{
        String city;
        Address(String city){
            this.city=city;
        }
    }

    static class Person implements Cloneable {
        String name;
        Address address;

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        Person deepcopy() {
            return new Person(this.name, new Address(this.address.city));
        }
    }


}
