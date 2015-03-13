package za.ac.cput.testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.testCases.Singleton.Calculator;

/**
 * Unit test for simple App.
 */
public class SingletonTest {
    Calculator calc,calc2;

    @Before
    public void setUp() throws Exception {
        calc = Calculator.getInstance();
        calc2 = Calculator.getInstance();
    }

    @Test
    public void testCalc() throws Exception {
        Assert.assertEquals(calc.hashCode(),calc2.hashCode());
    }
}