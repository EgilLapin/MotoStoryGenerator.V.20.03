import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// Implement a class Car with the following properties.
public class Car {

    // A car has a certain fuel efficiency (measured in km/litre)
    private double fuelEfficiency;
    // and a certain amount of fuel in the fuel tank.
    private double amountOfFuel;
    // The efficiency is specified in the constructor,
    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        // and the initial fuel level is 1.
        this.amountOfFuel = 1;
    }

    // Supply a method drive that simulates driving the car for a certain distance,
    private void drive(double distance) {
        if (distance<0) {
            System.out.println("Stop messing with the Odometer... Driving KM`s " + distance + " is kind of not possible");
            callPolice();
        } else {
            double neededFuel = distance * fuelEfficiency / 100;
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
    private void getFuelLevel(){
        System.out.println("Fuel level now around: " + new BigDecimal
                (this.amountOfFuel, new MathContext(1, RoundingMode.UP))
        );
    }

    private void addFuel(double addedFuel){
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L Fuel...");
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
        Car myHybrid = new Car(6.66);
        myHybrid.getFuelLevel(); //Print fuel remaining
        myHybrid.addFuel(46.66); // Tank 46.66 litres
        myHybrid.drive(666); // Drive 666 km
        myHybrid.getFuelLevel(); //Print fuel remaining

        myHybrid.addFuel(20); // Tank extra 20 litres
        myHybrid.drive(222); // Try Drive 222 km
        myHybrid.getFuelLevel(); //Print fuel remaining

        //Checking for negative values :)
        myHybrid.drive(-666); // Drive -666 km
        myHybrid.addFuel(-13); // Tank -13 litres
        myHybrid.getFuelLevel(); //Print fuel remaining
    }
}
