package za.ac.cput.strategyPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class CalculateTest {

    Context add,dvd;

    @Before
    public void setUp() throws Exception {
        add = Context.getInstance(new Add());
        dvd = Context.getInstance(new Division());
    }

    @Test
    public void testCalc() throws Exception {
        Assert.assertEquals(dvd.makeCalculations(20,2),add.makeCalculations(9,1));
    }
}
