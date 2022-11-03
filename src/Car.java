// Implement a class Car with the following properties.
public class Car {

    // A car has a certain fuel efficiency (measured in km/litre)
    private int fuelEfficiency;
    // and a certain amount of fuel in the fuel tank.
    private int amountOfFuel;
    // The efficiency is specified in the constructor,
    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        // and the initial fuel level is 0.
        this.amountOfFuel = 0;
    }

    // Supply a method drive that simulates driving the car for a certain distance,
    private void drive(int distance) {
        if (distance<0) {
            System.out.println("Stop messing with the Odometer...");
            callPolice();
        } else {
            int neededFuel = distance * fuelEfficiency / 100;
            if (neededFuel > amountOfFuel) {
                System.out.println("Not Enough fuel to cover the distance, need "
                        + neededFuel + "L of Fuel to cover the distance," +
                        "\nDrive postponed until more fuel is added ");
            } else {
                this.amountOfFuel = this.amountOfFuel - neededFuel;
                System.out.println("Driving " + distance + "KM`s...");
            }
        }
    }

    // and methods getFuelLevel,
    private int getFuelLevel(){
        System.out.println("Fuel level now at " + this.amountOfFuel);
        return this.amountOfFuel;
    }

    private void addFuel(int addedFuel){
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal Fuel...");
            callPolice();
        } else {
            this.amountOfFuel = this.amountOfFuel+addedFuel;
            System.out.println("Added " + addedFuel+ "L of Fuel...");
        }
    }

    // adding extra method as a bonus for safety :)
    private void callPolice(){
        System.out.println("Sensing tampering with the car, calling the police...");
    }

    //return the current fuel level, and addFuel, to tank up.
    public static void main(String[] args) {
        Car myHybrid = new Car(30);
        System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining
        myHybrid.addFuel(20); // Tank 20 litres
        myHybrid.drive(100); // Drive 100 km

        myHybrid.addFuel(20); // Tank extra 20 litres
        myHybrid.drive(100); // Try Drive 100 km again
        System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining

        //Checking for negative values :)
        myHybrid.drive(-100); // Drive -100 km
        myHybrid.addFuel(-20); // Tank -20 litres
        System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining
    }
}
