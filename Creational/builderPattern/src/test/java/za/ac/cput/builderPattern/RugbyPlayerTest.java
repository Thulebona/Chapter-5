package za.ac.cput.builderPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class RugbyPlayerTest {

    PlayerBuilder pBuilder;
    PlayerDirector pDirector;
    Player player;
    @Before
    public void setUp() throws Exception {

        pBuilder = new Rugby();
        pDirector = new PlayerDirector(pBuilder);
        pDirector.constructPlayer();
        player = pDirector.getPlayer();
    }

    @Test
    public void testRugbyPlayer() throws Exception {
        Assert.assertEquals("Rugby",player.getSportType());

    }
}
