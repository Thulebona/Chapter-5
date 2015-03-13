package za.ac.cput.mediator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class ChatRoomTest {

    User user1,user2;

    @Before
    public void setUp() throws Exception {
        user1 = new User("0747913196");
        user2 = new User("0847913196");
    }

    @Test
    public void testChat() throws Exception {

      Assert.assertEquals(user1.SendMsg("hi").substring(0,3),user2.SendMsg("hi").substring(0,3));
    }
}
