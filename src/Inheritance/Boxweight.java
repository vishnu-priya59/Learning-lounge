package Inheritance;

public class Boxweight extends Box {
    double weight;

    Boxweight(){
        this.weight=-1;
    }

    Boxweight(double l, double h, double w, double weight){
        super(l,h,w);
    }
}
