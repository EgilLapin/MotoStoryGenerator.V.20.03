package Vehicles.Moto.ZX666R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static Vehicles.Moto.ZX666R.KawasakiZX666R.minimumRecommendedFuel;
import static Vehicles.Moto.ZX666R.KawasakiZX666R.zx666rString;
import static Vehicles.Moto.ZX666R.ZX666RNotOkUtils.*;
import static Vehicles.Vehicle.amountOfFuel;


public class MyZX666RUtils {

    /**
     * Util Methods for ZX666R
     *
     * @author  NINJA ZX666R
     * @version 1.4
     * @Date 26.11.2022
     */
    protected static Boolean checkIfBikeOK() {
        boolean isMotoOk;
        double randomMotoCheck = Math.random();
        if (randomMotoCheck > 0.222) {
            isMotoOk = true;
            System.out.println("All seems good with " + zx666rString + "! Time for a ride...");
        } else {
            isMotoOk = false;
            System.out.println("Something feels off with " + zx666rString + "! Need further investigation...");
        }
        return isMotoOk;
    }

    protected static boolean checkFuelLevel() {
        if (amountOfFuel>minimumRecommendedFuel) {
            System.out.println("Checking Fuel tank - seems heavy... should be good!");
            return true;
        }
        System.out.println("Checking Fuel tank - seems light... need more fuel");
        return false;
    }

    protected static void investigateTheZX666RFurther() {
        System.out.println("Beginning quick walk-around of " + zx666rString + "...");
        int randomIssueFromTheMotoGods = new Random().nextInt(8);
        System.out.println("Hmmm, what is the issue?");
        WebDriver driver = new ChromeDriver();
            switch (randomIssueFromTheMotoGods) {
                case 1:
                    System.out.println("Looks like the headlight is not working");
                    driver.get("https://googlethatforyou.com?q=how%20to%20fix%20zx6r%202003%20headlight");
                    goToGrandpasGarage();
                    break;
                case 2:
                    System.out.println("Blinker wires disconnected");
                    driver.get("https://googlethatforyou.com?q=how%20to%20replace%20zx6r%202003%20blinker%20wires");
                    goToGrandpasGarage();
                    break;
                case 3:
                    System.out.println("Tyre pressure seems off");
                    driver.get("https://googlethatforyou.com?q=nearest%20Circle%20K%20near%20me");
                    goToCircleK();
                    break;
                case 4:
                    System.out.println("Engine does not start");
                    driver.get("https://googlethatforyou.com?q=ZX6R%202003%20engine%20removal");
                    callMotoSensei();
                    break;
                case 5:
                    System.out.println("Clutch cable seems loose");
                    driver.get("https://googlethatforyou.com?q=how%20to%20adjust%20my%20clutch%20cable");
                    goToGrandpasGarage();
                    break;
                case 6:
                    System.out.println("Something wrong with the brake feel");
                    driver.get("https://googlethatforyou.com?q=ZX6R%202003%20front%20brake%20replacement");
                    goToGrandpasGarage();
                    break;
                case 7:
                    System.out.println("No idea whats wrong...");
                    driver.get("https://googlethatforyou.com?q=ZX6R%202003%20service%20manual");
                    doingTopSecretFurtherResearch();
                    break;
                case 0:
                    System.out.println(zx666rString + " randomly started working again... who knows why");
                    goToGrandpasGarage();
                    break;
            }
    }

     static void getMyASCIIArtFromFile(String FileName) {
        String myASCIIArtFromFile;
        try {
            myASCIIArtFromFile = new String(Files.readAllBytes(Paths.get(FileName)));
        } catch (IOException e) {
            myASCIIArtFromFile = "XXXXXXXXXXXXXXXXXXXX My ASCII Art File Not Fund XXXXXXXXXXXXXXXXXXXX";
        }
        System.out.println(myASCIIArtFromFile);
    }

}
