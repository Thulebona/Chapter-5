package za.ac.cput.singleton;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/04.
 */
public class CalculateR_AreaTest extends TestCase{

    CalculateR_Area area;

    @Before
    public void setUp() throws Exception {
        area = CalculateR_Area.getInstance();
    }

    @Test
    public void testArea() throws Exception {
        assertEquals(area.calculate(4.2, 2.6) , area.calculate(4.2, 2.6));
    }
}
