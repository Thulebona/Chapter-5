package za.ac.cput.engineAdapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CurrencyRandTest{

    CurrencyInD doller;
    CurrencyInD rand;

    @Before
    public void setUp() throws Exception {
        doller = CurrencyConverterToDols.getInstanceOfDol();
        rand   = CurrencyConverterToRands.getInstanceOfRand();
    }

    @Test
    public void testCurrencyD() throws Exception {

        doller.setCurrencyInD(500);
        Assert.assertEquals(doller.getCurrencyInR(),50,50);
    }
    @Test
    public void testCurrencyR() throws Exception {

        rand.setCurrencyInR(50);
        Assert.assertEquals(rand.getCurrencyInD(),500,500);
    }
}