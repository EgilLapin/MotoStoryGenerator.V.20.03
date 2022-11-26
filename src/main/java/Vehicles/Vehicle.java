package Vehicles;

public abstract class Vehicle {

        // A car has a certain fuel efficiency (measured in km/litre)
        private double fuelEfficiency;
        // and a certain amount of fuel in the fuel tank.
        public static double amountOfFuel;
        // The efficiency is specified in the constructor,
        public Vehicle(double fuelEfficiency,double amountOfFuel) {
            this.fuelEfficiency = fuelEfficiency;
            this.amountOfFuel = amountOfFuel;
        }

    // Supply a method drive that simulates driving the car for a certain distance,
    public void ride(double distance) {
        if (distance<0) {
            System.out.println("Stop messing with the Odometer... Driving " + distance + " KM`s is kind of not possible");
            callPolice();
        } else {
            double neededFuel = distance * fuelEfficiency / 100;
            if (neededFuel > amountOfFuel) {
                System.out.println("Not Enough fuel to cover the distance, need extra "
                        + neededFuel + "L of Fuel to cover the distance," +
                        "\nDrive postponed until more fuel is added ");
            } else {
                this.amountOfFuel = this.amountOfFuel - neededFuel;
                System.out.println("Driving " + distance + "KM`s...");
            }
        }
    }

    // and methods getFuelLevel,
    public void getFuelLevel(){
        System.out.println("Fuel level now at : " + this.amountOfFuel+"\nX-X-X-X-X-X-X-X-X-X-X-");
    }

        // method to add fuel to Vehicles.Vehicle
    public abstract void addFuel(double addedFuel);

    // adding extra method as a bonus for safety :)
    protected void callPolice(){
        System.out.println("Sensing tampering with the Vehicle, calling the police...");
      }


    }


