package za.ac.cput.flyweightPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class SpeedTest {

    GearShifting gs;
    Speed sp;
    @Before
    public void setUp() throws Exception {
        gs = GearShifting.getInstance();

    }

    @Test
    public void testGear() throws Exception {

        sp = gs.getGears("up");
        sp = gs.getGears("up");
        sp = gs.getGears("Down");
        Assert.assertEquals(1,sp.getGear());
    }
}
