package Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
      this.h=-1;
      this.w=-1;
      this.l=-1;
    }

    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l, double w, double h){
        this.l=l;
        this.h=h;
        this.w=w;
    }

//    public void information(){
//        System.out.println("Running the information");
//    }
}
