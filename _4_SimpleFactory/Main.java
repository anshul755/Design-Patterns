package _4_SimpleFactory;

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

class VehicleFactory{
    public Vehicle getVehicle(String type){
        if(type==null) return null;

        if(type.equalsIgnoreCase("CAR")) return new Car();

        if(type.equalsIgnoreCase("BIKE")) return new Bike();
        
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new VehicleFactory();

        Vehicle audi=vehicleFactory.getVehicle("car");
        audi.drive();

        Vehicle pulsar=vehicleFactory.getVehicle("Bike");
        pulsar.drive();
    }
}
