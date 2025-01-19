interface Interfacevehicle {
    //int x = 5;
    void move();
}

      class Cars implements Interfacevehicle{
         //int x = 8;;
          public void move(){
              System.out.println("Im moving");
          }
      }
      class Truck implements Interfacevehicle{
          public void move(){
              System.out.println("Im moving");
          }
      }
      class Interface{
          public static void main(String[] args) {
              Interfacevehicle car = new Cars();
             // System.out.println(car.x);
              car.move();
          }
      }


