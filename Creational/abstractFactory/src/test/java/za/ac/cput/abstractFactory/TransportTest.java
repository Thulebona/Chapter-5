package za.ac.cput.abstractFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.abstractFactory.Transport.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class TransportTest {

    AbstractFactory AF;
    FactoryType FT;
    FactoryType FT2;
    Transport t1;
    Transport t2;

    @Before
    public void setUp() throws Exception {

        AF = AbstractFactory.getAbstrctF();
        FT =  AF.getFactory("Ship");
        FT2 =  AF.getFactory("Vehicle");
        t1 = FT.getTransport("Ferry");
        t2 = FT2.getTransport("Tank");
    }

    @Test
    public void testTransport() throws Exception {

        Assert.assertEquals("Tank",t2.getName());
    }
    @Test
    public void testShip() throws Exception {

        Assert.assertEquals("Ferry",t1.getName());
    }
}
