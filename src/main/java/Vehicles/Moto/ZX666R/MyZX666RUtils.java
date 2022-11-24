package Vehicles.Moto.ZX666R;

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
     * @version 1.3
     * @Date 24.11.2022
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
            switch (randomIssueFromTheMotoGods) {
                case 1:
                    System.out.println("Looks like the headlight is not working");
                    goToGrandpasGarage();
                    break;
                case 2:
                    System.out.println("Blinker wires disconnected");
                    goToGrandpasGarage();
                    break;
                case 3:
                    System.out.println("Tyre pressure seems off");
                    goToCircleK();
                    break;
                case 4:
                    System.out.println("Engine does not start");
                    callMotoSensei();
                    break;
                case 5:
                    System.out.println("Clutch cable seems loose");
                    goToGrandpasGarage();
                    break;
                case 6:
                    System.out.println("Something wrong with Brake feel");
                    goToGrandpasGarage();
                    break;
                case 7:
                    System.out.println("No idea whats wrong...");
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
