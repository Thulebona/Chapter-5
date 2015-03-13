package za.ac.cput.testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.testCases.AbstractFactory.AbstractFactory;
import za.ac.cput.testCases.AbstractFactory.Subject;
import za.ac.cput.testCases.AbstractFactory.SubjectsFactory;

/**
 * Created by student on 2015/03/13.
 */
public class AbstractTest {

    AbstractFactory abstractFactory;
    SubjectsFactory subjectsFactory;
    Subject subject;
    @Before
    public void setUp() throws Exception {
        abstractFactory = new AbstractFactory();
        subjectsFactory = abstractFactory.getSubjectYear("second");
        subject = subjectsFactory.getSubjectName("DOS002");
     }

    @Test
    public void testThirdYear() throws Exception {

        Assert.assertEquals(subject.getSubjectName(),"Development Software 2");
    }
}
