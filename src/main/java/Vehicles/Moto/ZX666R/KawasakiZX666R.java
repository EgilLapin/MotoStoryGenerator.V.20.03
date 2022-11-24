package Vehicles.Moto.ZX666R;

import Vehicles.Moto.Motorcycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static Vehicles.Moto.ZX666R.MyZX666RUtils.*;

public class KawasakiZX666R extends Motorcycle {

    /**
     * @author NINJA ZX666R
     * @version 1.2
     * @Date 23.11.2022
     */

    static double minimumRecommendedFuel = 10;
    static double fuelTankCap = 15;
    private float throttleAmount;
    private float total = 100;
    private float percent = (100 * throttleAmount) / total;
    private static final String fullSendConstant = "FULL SEND!";
    protected final static String zx666rString = "My beloved ZX666R";
    boolean alreadyDidAFullSend = false;
    private boolean anotherFullSend = false;
    private String myASCIIArt = "src/main/java/Vehicles/Moto/ZX666R/myASCIIArt.txt";
    private String myASCIISignature = "src/main/java/Vehicles/Moto/ZX666R/myASCIISignature.txt";


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

    public void callTheDevil() {
        System.out.println("Sensing tampering with the ZX666R, calling the Devil...");
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
        alreadyDidAFullSend = true;
    }

    private void goFullSend200(float maxWrist) {
        setThrottleAmount(maxWrist);
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Kawasaki_Ninja_ZX-6R");
        System.out.println("Throttle set at " + throttleAmount + "%");
        System.out.println("Going " + fullSendConstant);
        getMyASCIIArtFromFile(myASCIISignature);
        getMyASCIIArtFromFile(myASCIIArt);
    }

    private static void getMyASCIIArtFromFile(String FileName) {
        String myASCIIArtFromFile;
        try {
            myASCIIArtFromFile = new String(Files.readAllBytes(Paths.get(FileName)));
        } catch (IOException e) {
            myASCIIArtFromFile = "XXXXXXXXXXXXXXXXXXXX My ASCII Art File Not Fund XXXXXXXXXXXXXXXXXXXX";
        }
        System.out.println(myASCIIArtFromFile);
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

    public boolean getAnotherFullSend() {
        return anotherFullSend;
    }

    public void setAnotherFullSend(boolean anotherFullSend) {
        this.anotherFullSend = anotherFullSend;
    }
}