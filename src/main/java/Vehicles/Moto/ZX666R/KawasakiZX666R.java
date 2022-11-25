package Vehicles.Moto.ZX666R;

import Vehicles.Moto.Motorcycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

import static Vehicles.Moto.ZX666R.MyZX666RUtils.*;
import static Vehicles.Moto.ZX666R.ZX666RNotOkUtils.callTheDevil;

public class KawasakiZX666R extends Motorcycle {

    /**
     * @author NINJA ZX666R
     * @version 1.3
     * @Date 24.11.2022
     */

    static final double minimumRecommendedFuel = 10;
    static final double fuelTankCap = 17;
    private float throttleAmount;
    volatile static String fullSendConstant = "FULL SEND!";
    protected final static String zx666rString = "My beloved ZX666R";
    private boolean alreadyDidAFullSend = false;
    private boolean anotherFullSend = false;
    private String myASCIIArt = "src/main/java/Vehicles/Moto/ZX666R/myASCIIArt.txt";
    private String myASCIISignature = "src/main/java/Vehicles/Moto/ZX666R/myASCIISignature.txt";
    private String linkToOpen = "https://en.wikipedia.org/wiki/Kawasaki_Ninja_ZX-6R";


    public KawasakiZX666R(double fuelEfficiency, double amountOfFuel) {
        super(fuelEfficiency, amountOfFuel);
    }

    @Override
    public void addFuel(double addedFuel) {
        if (addedFuel < 0) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L of Fuel...");
            callPolice();
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
            boolean fuelLevelCheck = checkFuelLevel();;
            if (fuelLevelCheck && checkIfBikeOK()) {
            goFullSend200(maxWrist);
            } else {
                if(!fuelLevelCheck && checkIfBikeOK()){
                    goToNeste();
                    goFullSend200(maxWrist);
                } else {
                    investigateTheZX666RFurther();
                }
            }
        } else {
            System.out.println("Meh... lets do something else instead");
        }
    }

    private void goFullSend200(float maxWrist) {
        setThrottleAmount(maxWrist);
        WebDriver driver = new ChromeDriver();
        driver.get(linkToOpen);
        System.out.println("Throttle set at " + throttleAmount + "%");
        System.out.println("Going " + fullSendConstant);
        getMyASCIIArtFromFile(myASCIISignature);
        getMyASCIIArtFromFile(myASCIIArt);
        alreadyDidAFullSend = true;
    }


    private void goToNeste() {
        System.out.println("Slowly riding to Neste to get some Futura 98");
        addFuel(fuelTankCap - amountOfFuel);
        System.out.println("Fuel now full...");
    }

    public void maybeAnotherFullSend200Today() {
        if (alreadyDidAFullSend) {
            System.out.println("I want another ride... but should I?");
            int shouldIRide = new Random().nextInt(9);
            if (shouldIRide > 3) {
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