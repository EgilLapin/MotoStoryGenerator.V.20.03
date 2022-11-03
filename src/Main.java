public class Main {

    //return the current fuel level, and addFuel, to tank up.
    public static void main(String[] args) {
        System.out.println("/////////////////Car////////////////////");
        Vehicle myHybrid = new Car(6.66,1);
        myHybrid.getFuelLevel(); //Print fuel remaining
        myHybrid.addFuel(46.66); // Tank 46.66 litres
        myHybrid.drive(666); // Drive 666 km
        myHybrid.getFuelLevel(); //Print fuel remaining

        //add too much fuel
        myHybrid.addFuel(63.362266666666673); // Tank extra 70 litres
        myHybrid.getFuelLevel(); //Print fuel remaining
        myHybrid.drive(200.300300300300300); // Try Drive 555 km
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
        myMotorcycle.getFuelLevel(); //Print fuel remaining
    }
}
