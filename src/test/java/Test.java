import Vehicles.Moto.ZX666R.KawasakiZX666R;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void theLazyMansQuickThrottleTest(){
        KawasakiZX666R testZX666R = new KawasakiZX666R(15,15);
        testZX666R.setThrottleAmount(22.2f);
        assertEquals(22.2f,testZX666R.getThrottleAmount());
        testZX666R.setThrottleAmount(77.7f);
        assertEquals(77.7f,testZX666R.getThrottleAmount());
    }
}
