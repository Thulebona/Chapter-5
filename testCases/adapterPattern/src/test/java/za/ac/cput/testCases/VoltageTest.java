package za.ac.cput.testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class VoltageTest {
    SocketAdapter voltClass,voltObj;

    @Before
    public void setUp() throws Exception {
        voltClass = new SocketClassAdapter();
        voltObj =new SocketObjectAdapter();
    }

    @Test
    public void testVoltCls() throws Exception {
        voltClass.get3Volt().setVolts(240);
        Assert.assertEquals(voltClass.get3Volt().getVolts(),6);
    }@Test
    public void testVoltObj() throws Exception {

        voltObj.get12Volt().setVolts(240);
        Assert.assertEquals(voltObj.get12Volt().getVolts(),24);

    }

}
