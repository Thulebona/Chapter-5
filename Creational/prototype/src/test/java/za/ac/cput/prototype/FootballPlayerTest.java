package za.ac.cput.prototype;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FootballPlayerTest {

    FootballPlayer player;
    FootballPlayer player2;
    @Before
    public void setUp() throws Exception {
        player = new FootballPlayer("GoalKeep","Amazulu FC");
        player2 = (FootballPlayer) player.makeCopy();
    }

    @Test
    public void testClone() throws Exception {
        Assert.assertEquals(player.toString(),player2.toString());
    }
}
