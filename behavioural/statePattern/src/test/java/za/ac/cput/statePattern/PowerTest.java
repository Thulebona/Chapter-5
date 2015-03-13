package za.ac.cput.statePattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class PowerTest {

    Laptop lp;

    @Before
    public void setUp() throws Exception {
        lp = Laptop.getLapInstance(new BatteryMode());
    }

    @Test
    public void testBattery() throws Exception {
        Assert.assertEquals(lp.performance().substring(0, 3),"Low");

    }

    @Test
    public void testOnPlug() throws Exception {
        lp.setPs(new OnPlugMode());

        Assert.assertEquals(lp.performance().substring(0, 3),"Max");
    }
}
