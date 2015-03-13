package za.ac.cput.builderPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FootBallPlayerTest {

    PlayerBuilder pBuilder;
    PlayerDirector pDirector;
    Player player;

    @Before
    public void setUp() throws Exception {

        pBuilder = new FootBall();
        pDirector = new PlayerDirector(pBuilder);
        pDirector.constructPlayer();
        player = pDirector.getPlayer();
    }

    @Test
    public void testFootBall() throws Exception {

        Assert.assertEquals(21,player.getAge());

    }
}
