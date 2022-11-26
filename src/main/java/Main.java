import Vehicles.Moto.ZX666R.KawasakiZX666R;

public class Main {

    /**
     * No unit tests, console prints will be enough for now...
     *
     * @author  NINJA ZX666R
     * @version 1.4
     * @Date 26.11.2022
     */

    public static void main(String[] args) {
        KawasakiZX666R zx6r = new KawasakiZX666R(15,15);
        zx6r.getFuelLevel();
        zx6r.drive(100);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.addFuel(4);
        zx6r.addFuel(1);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.drive(222);
        zx6r.drive(-100);
        zx6r.addFuel(-2.22);
        zx6r.getFuelLevel(); //Print fuel remaining
        zx6r.fullSend200(99.999f);
        System.out.println("Few hours later.....");
        zx6r.maybeAnotherFullSend200Today();
        zx6r.fullSend200(99.999f);
    }
}
