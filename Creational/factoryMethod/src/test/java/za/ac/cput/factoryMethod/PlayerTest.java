package za.ac.cput.factoryMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/04.
 */
public class PlayerTest {
    PlayerFactory play;

    @Before
    public void setUp() throws Exception {
        play = new PlayerFactory();
    }

    @Test
    public void testPlayer() throws Exception {
        Player p1 = PlayerFactory.getPlayerLeague("PSL");
        Assert.assertEquals("Left Winger",p1.position());
    }
}
