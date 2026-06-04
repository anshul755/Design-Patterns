package _5_FactoryMethod;

interface Vehicle{
    void drive();
}

class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Driving Car");
    }
}

class Bike implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Driving Bike");
    }
}

abstract class VehicleFactory{
    Vehicle vehicle;

    abstract Vehicle createVehicle();

    public void startJourney(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}

class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Car();
    }
}

class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(){
        return new Bike();
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory=new CarFactory();

        carFactory.startJourney();

        VehicleFactory bikeFactory=new BikeFactory();
        
        bikeFactory.startJourney();
    }
}
