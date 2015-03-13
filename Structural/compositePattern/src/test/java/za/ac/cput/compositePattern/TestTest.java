package za.ac.cput.compositePattern;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class TestTest {

   private Term trm1,trm2;
   private Student std,std2,std3;

    @Before
    public void setUp() throws Exception {
        trm1  = Term.getTermInst();
        trm2   = Term.getTermInst();
        std = Student.getStudentInst("213033402",78);
        std2 = Student.getStudentInst("213033404",49);
        std3 = Student.getStudentInst("213033400",89);



    }

    @Test
    public void testResult() throws Exception {

        trm1.add(std);
        trm2.add(std2);
        trm2.add(std3);

        trm2.Results();
        trm1.Results();

        System.out.println("**********************************");
        trm2.remove(std2);

        trm2.Results();
        trm1.Results();

        Assert.assertEquals(trm1.getListsize(), trm2.getListsize());

    }
}