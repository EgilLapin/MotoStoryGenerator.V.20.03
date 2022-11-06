package Vehicles.Moto;

import Vehicles.Vehicle;

// Implement a class Vehicles.Moto.Motorcycle with 15 fuelTankCap
public class Motorcycle extends Vehicle {

    public Motorcycle(double fuelEfficiency,double amountOfFuel) {
        super(fuelEfficiency,amountOfFuel);
    }
    @Override
    public void addFuel(double addedFuel) {
        double fuelTankCap = 15;
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L Fuel...");
            callPolice();
        } else if (addedFuel > fuelTankCap) {
            System.out.println("Trying to add " + addedFuel+ "L of Fuel...");
            System.out.println("Cannot add more than "+ fuelTankCap + "L to a Vehicles.Moto.Motorcycle tank, you lost "
                    + (amountOfFuel+addedFuel-fuelTankCap)+
                    "L of fuel,\nbecause you already had " + amountOfFuel + "L of fuel in the tank, sorry!");
            this.amountOfFuel = fuelTankCap;
        } else {
            this.amountOfFuel = this.amountOfFuel+addedFuel;
            System.out.println("Added " + addedFuel+ "L of Fuel...");
        }
    }
}
