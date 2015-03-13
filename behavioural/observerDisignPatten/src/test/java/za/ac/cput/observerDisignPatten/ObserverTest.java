package za.ac.cput.observerDisignPatten;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ObserverTest {

    Student std;
    Year nd,bTech;

    @Before
    public void setUp() throws Exception {
        std= new Student();
        nd = new Year();
        bTech = new Year();
    }

    @Test
    public void testYear() throws Exception {
        nd.addObserver(std);
        bTech.addObserver(std);
        Assert.assertNotEquals(nd.setYear("3"), bTech.setYear("bTech"));

    }
}
