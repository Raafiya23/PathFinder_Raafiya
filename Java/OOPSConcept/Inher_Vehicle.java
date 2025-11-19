class Vehicle{
    String brand;
    int year;
    void startEngine(){
        System.out.println("Engine Starts..");
    }
}

class Car extends Vehicle{
    String type;

    @Override
    void startEngine(){
        System.out.println("Car engine starts..");
    }
    void drive(){
        System.out.println("Car is driving..");
    }
}

class Truck extends Vehicle{
    int loadCapacity;

    @Override
    void startEngine(){
        System.out.println("Truck engine starts..");
    }
    void haul(){
        System.out.println("Truck is hauling..");
    }
} 

public class Inher_Vehicle{
    public static void main(String[] args) {
           Car car = new Car();
           car.brand="Maruti";
           car.year=1;
           car.startEngine();
           car.drive();
           System.out.println("-------");
           Truck truck = new Truck();
           truck.brand="Ashok Leyland";
           truck.year=3;
           truck.startEngine();
           truck.haul();
    }
}