package Vehicles.Cars;

import Vehicles.Vehicle;
/**
 *Development of Cars Package discontinued due to lack of resources, sorry, someone please continue with it...
 *
 * @author  NINJA ZX666R
 * @version 1.0
 */
public class Car extends Vehicle {



    public Car(double fuelEfficiency, double amountOfFuel) {
        super(fuelEfficiency,amountOfFuel);
    }

    @Override
    public void addFuel(double addedFuel) {
        double fuelTankCap = 60;
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L Fuel...");
            callPolice();
        }  else if (addedFuel > fuelTankCap) {
            System.out.println("Trying to add " + addedFuel+ "L of Fuel...");
            System.out.println("Cannot add more than " + fuelTankCap + " to a Vehicles.Cars.Car tank, you lost "
                    + (amountOfFuel+addedFuel-fuelTankCap)+
                    "L of fuel,\nbecause you already had " + amountOfFuel + "L of fuel in the tank, sorry! Watch out for the Fuel spill!");
            this.amountOfFuel = fuelTankCap;
        } else {
            this.amountOfFuel = this.amountOfFuel+addedFuel;
            System.out.println("Added " + addedFuel+ "L of Fuel...");
        }
    }
}
