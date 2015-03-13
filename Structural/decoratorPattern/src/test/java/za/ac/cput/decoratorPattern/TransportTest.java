package za.ac.cput.decoratorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TransportTest {

    Transport suv,truck;

    @Before
    public void setUp() throws Exception {
        suv = new SUV(new Vehicle());
        truck= new Truck(new Vehicle());
    }

    @Test
    public void testVehicle() throws Exception {

       Assert.assertNotEquals(suv.carType("Jeep") , truck.carType("MEN"));
    }
}
