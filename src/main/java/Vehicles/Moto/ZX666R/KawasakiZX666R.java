package Vehicles.Moto.ZX666R;

import Vehicles.Moto.Motorcycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static Vehicles.Moto.ZX666R.MyZX666RUtils.*;
import static Vehicles.Moto.ZX666R.ZX666RNotOkUtils.callTheDevil;
/**
 * @author NINJA ZX666R
 * @version 1.4
 * @Date 26.11.2022
 */
public class KawasakiZX666R extends Motorcycle {
    static final double minimumRecommendedFuel = 10;
    static final double fuelTankCap = 17;
    private float throttleAmount;
    private boolean alreadyDidAFullSend = false;
    private boolean anotherFullSend = false;


    public KawasakiZX666R(double fuelEfficiency, double amountOfFuel) {
        super(fuelEfficiency, amountOfFuel);
    }

    @Override
    public void addFuel(double addedFuel) {
        if (addedFuel < 0) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L of Fuel...");
            callPolice(); // TODO: Not sure if this method really is needed here...
            callTheDevil();
        } else if (addedFuel > fuelTankCap) {
            System.out.println("Trying to add " + addedFuel + "L of Fuel...");
            System.out.println("Cannot add more than " + fuelTankCap + "L to a Motorcycle tank, you lost "
                    + (amountOfFuel + addedFuel - fuelTankCap) +
                    "L of fuel,\nbecause you already had " + amountOfFuel + "L of fuel in the tank, sorry!");
            this.amountOfFuel = fuelTankCap;
        } else {
            this.amountOfFuel = this.amountOfFuel + addedFuel;
            System.out.println("Added " + addedFuel + "L of Fuel...");
        }

        if (amountOfFuel < minimumRecommendedFuel) {
            System.out.println("Please add more than " + minimumRecommendedFuel + "L!!!");
        }
    }
    public final void fullSend200(float maxWrist) {
        if ((!alreadyDidAFullSend) || getAnotherFullSend()) {
            System.out.println("Preparing for " + fullSendConstant + " Checking if Bike is OK...");
            boolean bikeChecker = checkIfBikeOK();
            boolean fuelLevelCheck = checkFuelLevel();;
            if (fuelLevelCheck && bikeChecker) {
            goFullSend200(maxWrist);
            } else {
                if(!fuelLevelCheck && bikeChecker){
                    goToNeste();
                    goFullSend200(maxWrist);
                } else {
                    investigateTheZX666RFurther();
                }
            }
        } else {
            System.out.println("Meh... lets do something else instead");
            WebDriver driver = new ChromeDriver();
            driver.get(meditationMusic);
            WebDriver driver2 = new ChromeDriver();
            driver2.get(linkToOpen);
        }
    }

    private void goFullSend200(float maxWrist) {
        setThrottleAmount(maxWrist);
        System.out.println("Throttle set at " + throttleAmount + "%");
        System.out.println("Going " + fullSendConstant);
        ride(getDistance());
        getMyASCIIArtFromFile(myASCIISignature);
        getMyASCIIArtFromFile(myASCIIArt);
        alreadyDidAFullSend = true;
    }

    private static int getDistance() {
        return new Random().nextInt(99);
    }

    private void goToNeste() {
        System.out.println("Slowly riding to Neste to get some Futura 98");
        addFuel(fuelTankCap - amountOfFuel);
        System.out.println("Fuel now full...");
    }

    public void maybeAnotherFullSend200Today() {
        if (alreadyDidAFullSend) {
            System.out.println("I want another ride... but should I?");
            int shouldIRide = new Random().nextInt(10);
            if (shouldIRide > 7) {
                setAnotherFullSend(true);
                System.out.println("Ehhh... lets " + fullSendConstant + " again");
            } else {
                setAnotherFullSend(false);
            }
        }
    }

    public void setThrottleAmount(float throttleAmount) {
        this.throttleAmount = throttleAmount;
    }

    public float getThrottleAmount() {
        return throttleAmount;
    }

    private boolean getAnotherFullSend() {
        return anotherFullSend;
    }

    private void setAnotherFullSend(boolean anotherFullSend) {
        this.anotherFullSend = anotherFullSend;
    }

}

