package za.ac.cput.commandPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class CommandTest {

    Web web;
    PointOfSell pos;
    RunApp ra;
    Command webComm,posComm;
    @Before
    public void setUp() throws Exception {
        web = Web.getWebInstance();
        webComm = WebApp.getWebInstance(web);

        pos = PointOfSell.getPosaInstance();
        posComm = PointOfSellApp.getPosaInstance(pos);



    }

    @Test
    public void testWeb() throws Exception {
        ra = new RunApp(webComm);

        Assert.assertEquals("Creating Web",ra.Run());

    }
    @Test
    public void testPos() throws Exception {
        ra = new RunApp(posComm);
        Assert.assertEquals("creating point of sell", ra.Run());

    }
}
