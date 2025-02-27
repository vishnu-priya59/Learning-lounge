package FactoryPattern;

public class FactoryVehicle {
    public Vehicle getvehicle(String VehicleType){
        if(VehicleType==null){
            return null;
        }
        if (VehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        } else if (VehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        } else if (VehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
