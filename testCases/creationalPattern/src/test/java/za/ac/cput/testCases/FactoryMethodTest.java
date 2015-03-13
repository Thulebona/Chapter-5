package za.ac.cput.testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.testCases.FactoryMethod.Employee;
import za.ac.cput.testCases.FactoryMethod.EmployeeFactory;

/**
 * Created by student on 2015/03/13.
 */
public class FactoryMethodTest {

    EmployeeFactory emplF;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        emplF = EmployeeFactory.getEmployeeFactoryInstance();
        employee = emplF.getEmployeeRole("Secretary");
    }

    @Test
    public void testFactory() throws Exception {

        Assert.assertEquals(employee.role(),"Secretary at CPUT");

    }
}
