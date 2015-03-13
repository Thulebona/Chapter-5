package za.ac.cput.mementoPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class StudentMementoTest {

    StudentInfoCareTaker stdc;
    StudentInfor std;

    @Before
    public void setUp() throws Exception {
        stdc = new StudentInfoCareTaker();
        std = new StudentInfor("213033402","16-feb-2012",1);

    }

    @Test
    public void testMemento() throws Exception {

        stdc.saveState(std);
        std.setRegDataAndYears("06-jan-2013", 2);
        stdc.restore(std);

        Assert.assertEquals("16-feb-2012",std.getRegData());



    }
}
