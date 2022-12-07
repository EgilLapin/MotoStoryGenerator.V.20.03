package Vehicles.Moto.ZX666R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static Vehicles.Moto.ZX666R.KawasakiZX666R.minimumRecommendedFuel;
import static Vehicles.Moto.ZX666R.ZX666RNotOkUtils.*;
import static Vehicles.Vehicle.amountOfFuel;

/**
 * Util Methods for ZX666R
 *
 * @author  NINJA ZX666R
 * @version 1.4
 * @Date 26.11.2022
 */
public class MyZX666RUtils {

    static String meditationMusic = "https://googlethatforyou.com?q=sith%20meditation%20music";
    static String linkToOpen = "https://en.wikipedia.org/wiki/Kawasaki_Ninja_ZX-6R";
    static String myASCIIArt = "src/main/java/Vehicles/Moto/ZX666R/myASCIIArt.txt";
    static String myASCIISignature = "src/main/java/Vehicles/Moto/ZX666R/myASCIISignature.txt";
    volatile static String fullSendConstant = "FULL SEND!!!";
    static String zx666rString = "My beloved ZX666R";
    private static String headLightNotWorkingSearch= "https://googlethatforyou.com?q=how%20to%20fix%20zx6r%202003%20headlight";
    private static String blinkerNotWorkingSearch = "https://googlethatforyou.com?q=how%20to%20replace%20zx6r%202003%20blinker%20wires";
    private static String nearestCircleKSearch = "https://googlethatforyou.com?q=nearest%20Circle%20K%20near%20me";
    private static String engineSearch = "https://googlethatforyou.com?q=ZX6R%202003%20engine%20removal";
    private static String clutchCableSearch = "https://googlethatforyou.com?q=how%20to%20adjust%20zx6r%20clutch%20cable";
    private static String brakeIssueSearch = "https://googlethatforyou.com?q=ZX6R%202003%20front%20brake%20replacement";
    private static String serviceManualSearch = "https://googlethatforyou.com?q=ZX6R%202003%20service%20manual";
    private static String ArtFileError = "XXXXXXXXXXXXXXXXXXXX My ASCII Art File Not Found XXXXXXXXXXXXXXXXXXX\n";

    private static boolean isMotoOk;

    static Boolean checkIfBikeOK() {
        double randomMotoCheck = Math.random();
        if (randomMotoCheck > 0.333) {
            isMotoOk = true;
            System.out.println("All seems good with " + zx666rString + "! Time for a ride...");
        } else {
            isMotoOk = false;
            System.out.println("Something feels off with " + zx666rString + "! Need further investigation...");
        }
        return isMotoOk;
    }

    static boolean checkFuelLevel() {
        if (amountOfFuel>minimumRecommendedFuel) {
            System.out.println("Checking Fuel tank - seems heavy... should be good!");
            return true;
        }
        System.out.println("Checking Fuel tank - seems light... need more fuel");
        return false;
    }

     static void investigateTheZX666RFurther() {
        System.out.println("Beginning quick walk-around of " + zx666rString + "...");
        int randomIssueFromTheMotoGods = new Random().nextInt(8);
        System.out.println("Hmmm, what is the issue?");
        WebDriver driver = new ChromeDriver();
            switch (randomIssueFromTheMotoGods) {
                case 1:
                    System.out.println("Looks like the headlight is not working");
                    driver.get(headLightNotWorkingSearch);
                    initGoingToGrandpasGarage();
                    break;
                case 2:
                    System.out.println("Blinker wires disconnected");
                    driver.get(blinkerNotWorkingSearch);
                    initGoingToGrandpasGarage();
                    break;
                case 3:
                    System.out.println("Tyre pressure seems off");
                    driver.get(nearestCircleKSearch);
                    goToCircleK();
                    break;
                case 4:
                    System.out.println("Engine does not start");
                    driver.get(engineSearch);
                    callMotoSensei();
                    break;
                case 5:
                    System.out.println("Clutch cable seems loose");
                    driver.get(clutchCableSearch);
                    initGoingToGrandpasGarage();
                    break;
                case 6:
                    System.out.println("Something wrong with the brake feel");
                    driver.get(brakeIssueSearch);
                    initGoingToGrandpasGarage();
                    break;
                case 7:
                    System.out.println("No idea whats wrong...");
                    driver.get(meditationMusic);
                    driver.get(serviceManualSearch);
                    initGoingToGrandpasGarage();
                    break;
                case 0:
                    System.out.println(zx666rString + " randomly started working again... who knows why");
                    initGoingToGrandpasGarage();
                    break;
            }
    }

     static void getMyASCIIArtFromFile(String FileName) {
        String myASCIIArtFromFile;
        try {
            myASCIIArtFromFile = new String(Files.readAllBytes(Paths.get(FileName)));
        } catch (IOException e) {
            myASCIIArtFromFile = ArtFileError + e;
        }
        System.out.println(myASCIIArtFromFile);
    }

}
