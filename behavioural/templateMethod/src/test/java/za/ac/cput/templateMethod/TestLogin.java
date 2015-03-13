package za.ac.cput.templateMethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class TestLogin {

    Login fb,mxt;

    @Before
    public void setUp() throws Exception {
        fb = new FacebookLog();
        mxt = new MxitLog();
    }

    @Test
    public void testLogin() throws Exception {
        Assert.assertEquals(fb.enterUserDetails("user", "2"), mxt.enterUserDetails("user", "1"));
    }
}
