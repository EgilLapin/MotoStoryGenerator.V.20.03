package Vehicles.Moto.ZX666R;

import java.util.Random;
import static Vehicles.Moto.ZX666R.MyZX666RUtils.zx666rString;

/**
 * Util Methods in case the ZX666R is not OK
 *
 * @author  NINJA ZX666R
 * @version 1.4
 * @Date 26.11.2022
 */
public class ZX666RNotOkUtils {

    static void callMotoSensei() {
        System.out.println("Calling Moto Sensei...");
        topSecretStuff();
    }

    static void goToGrandpasGarage() {
        System.out.println("I wonder what is Grandpa doing Today...");
        callingGrandpa();
    }

    static void doingTopSecretFurtherResearch() {
        topSecretStuff();
    }

    static void goToCircleK() {
        System.out.println("Going to CircleK to check and adjust Tyre pressure...");
        boolean isThereIssueWithTyres = new Random().nextBoolean();
            if(isThereIssueWithTyres == true) {
                topSecretStuff();
            } else {
                System.out.println("Adding or decreasing Tyre pressure...");
            }
        }
    static void callTheDevil() {
        System.out.println("Sensing tampering with the " + zx666rString +", calling the Devil...");
    }
    ////////////////////More private Util Methods//////////
    private static void topSecretStuff(){
        System.out.println("Doing T0P SECRET MOTO stuff");
    }
    private static void callingGrandpa(){
        System.out.println("Calling Grandpa.... Hope he is not busy");
        int  isGrandpaBusy = new Random().nextInt(9);
        if(isGrandpaBusy > 6) {
            System.out.println("Grandpa is very busy... will sort this out later");
        } else {
            System.out.println("Grandpa says he is not busy");
            topSecretStuff();
        }
    }
}
