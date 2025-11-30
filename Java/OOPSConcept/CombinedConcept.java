//Abstract class
abstract class Vehicles{
    //final method
    final void startsEngine(){
        System.out.println("Engine Started..");
    }

    //static method
    static String getVehicleType(){
        return "Generic Vehicle";
    }

    abstract void drive();
}

class Cars extends Vehicles{
    @Override
    void drive(){
        System.out.println("Drive a car..");
    }
}

class Motorcycle extends Vehicles{
    @Override
    void drive(){
        System.out.println("Drive a bike..");
    }
}

public class CombinedConcept{
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.drive();

        Motorcycle m1 = new Motorcycle();
        m1.drive(); 

        System.out.println(Vehicles.getVehicleType());
    }
}