package Vehicles.Moto.ZX666R;

import java.util.Random;

public class ZX666RNotOkUtils {

    /**
     * Util Methods in case the ZX666R is not OK
     *
     * @author  NINJA ZX666R
     * @version 1.2
     * @Date 23.11.2022
     */

    static boolean canIFullSend;
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