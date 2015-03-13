package za.ac.cput.facadePattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/11.
 */
public class SalaryTest {
    Salary salary;
    @Before
    public void setUp() throws Exception {
        salary = Salary.getSalaryInstance();
    }

    @Test
    public void testSal() throws Exception {

        System.out.println(salary.getMonthlySal(50,"Employee"));
    }
}
