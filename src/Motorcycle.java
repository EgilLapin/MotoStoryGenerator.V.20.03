// Implement a class Motorcycle with 15 fuelTankCap
public class Motorcycle extends Vehicle {

    public Motorcycle(double fuelEfficiency,double amountOfFuel) {
        super(fuelEfficiency,amountOfFuel);
    }
    @Override
    public void addFuel(double addedFuel) {
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L Fuel...");
            callPolice();
        } else if (addedFuel > 15) {
            System.out.println("Trying to add " + addedFuel+ "L of Fuel...");
            System.out.println("Cannot add more than 15L to a Motorcycle tank, you lost "
                    + (amountOfFuel+addedFuel-15)+
                    "L of fuel,\nbecause you already had " + amountOfFuel + "L of fuel in the tank, sorry!");
            this.amountOfFuel = 15;
        } else {
            this.amountOfFuel = this.amountOfFuel+addedFuel;
            System.out.println("Added " + addedFuel+ "L of Fuel...");
        }
    }
}
