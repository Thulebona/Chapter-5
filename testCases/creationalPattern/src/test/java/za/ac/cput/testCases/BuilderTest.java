package za.ac.cput.testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.testCases.BuilderPattern.DiplomaCourseBuilder;
import za.ac.cput.testCases.BuilderPattern.DiplomaCourseDirector;
import za.ac.cput.testCases.BuilderPattern.SecondYearDiplomaCourseBuilder;
import za.ac.cput.testCases.BuilderPattern.ThirdYearDiplomaCourseBuilder;

/**
 * Created by student on 2015/03/13.
 */
public class BuilderTest {
    DiplomaCourseBuilder diplomaCourseBuilder,diplomaCourseBuilder2;
    DiplomaCourseDirector diplomaCourseDirector,diplomaCourseDirector2;

    @Before
    public void setUp() throws Exception {
        diplomaCourseBuilder = new SecondYearDiplomaCourseBuilder();
        diplomaCourseBuilder2 = new ThirdYearDiplomaCourseBuilder();

        diplomaCourseDirector = new DiplomaCourseDirector(diplomaCourseBuilder);
        diplomaCourseDirector2 = new DiplomaCourseDirector(diplomaCourseBuilder2);

        diplomaCourseDirector.constructDiplomaCourse();
        diplomaCourseDirector2.constructDiplomaCourse();

    }

    @Test
    public void testSecondYear() throws Exception {

        Assert.assertNotEquals(diplomaCourseDirector2.getDiplomaCourse(),diplomaCourseDirector.getDiplomaCourse());

    }
}
