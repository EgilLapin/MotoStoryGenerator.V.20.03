import Vehicles.Cars.Car;
import Vehicles.Moto.KawasakiZX666R;
import Vehicles.Moto.Motorcycle;
import Vehicles.Vehicle;

public class Main {

    //return the current fuel level, and addFuel, to tank up.
    public static void main(String[] args) {
        System.out.println("/////////////////Vehicles.Cars.Car////////////////////");
        Vehicle myHybrid = new Car(6.66,1);
        myHybrid.getFuelLevel(); //Print fuel remaining
        myHybrid.addFuel(46.66); // Tank 46.66 litres
        myHybrid.drive(666); // Drive 666 km
        myHybrid.getFuelLevel(); //Print fuel remaining

        //add too much fuel
        myHybrid.addFuel(63.362266666666673); // Tank extra 63.362266666666673 litres
        myHybrid.getFuelLevel(); //Print fuel remaining
        myHybrid.drive(200.300300300300300); // Try Drive 200 km
        myHybrid.getFuelLevel(); //Print fuel remaining

        //Checking for negative values :)
        myHybrid.drive(-666); // Drive -666 km
        myHybrid.addFuel(-13); // Tank -13 litres
        myHybrid.getFuelLevel(); //Print fuel remaining

        System.out.println("/////////////////MOTO////////////////////");
        Motorcycle myMotorcycle = new Motorcycle(7.77,3);
        myMotorcycle.getFuelLevel(); //Print fuel
        myMotorcycle.addFuel(11.11); // Tank 11.11 litres
        myMotorcycle.drive(200); // Drive 200 km
        myMotorcycle.getFuelLevel(); //Print fuel remaining

        myMotorcycle.addFuel(222.222); // Tank extra 222.222 litres
        myMotorcycle.getFuelLevel(); //Print fuel remaining
        myMotorcycle.drive(100); // Try Drive 100 km
        myMotorcycle.getFuelLevel(); //Print fuel remaining

        //Checking for negative values :)
        myMotorcycle.drive(-666); // Drive -666 km
        myMotorcycle.addFuel(-13); // Tank -13 litres
        myMotorcycle.getFuelLevel(); //Print fuel remaining

        myMotorcycle.drive(80); // Try Drive 80 km
        myMotorcycle.getFuelLevel(); //Print fuel remaining*/
        System.out.println("/////////////////KAWA////////////////////");
        KawasakiZX666R zx6r = new KawasakiZX666R(15,15);
        zx6r.getFuelLevel();
        zx6r.drive(100);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.addFuel(4);
        zx6r.addFuel(1);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.drive(222);
        zx6r.drive(-100);
        zx6r.addFuel(-2.22);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.fullSend200(99.999f);
        zx6r.addFuel(7.77);
        zx6r.fullSend200(99.999f);
    }
}
