package za.ac.cput.testCases;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.testCases.Prototype.Lecturer;

/**
 * Created by student on 2015/03/13.
 */
public class PrototypeTest {

    Lecturer lecturer,lecturer2;

    @Before
    public void setUp() throws Exception {
        lecturer = new Lecturer("Thulebona");
        lecturer2 =(Lecturer)lecturer.makeCopy();
    }

    @Test
    public void testCopy() throws Exception {

        Assert.assertEquals(lecturer.toString(), lecturer2.toString());

    }
}
