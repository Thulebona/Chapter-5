package za.ac.cput.testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by student on 2015/03/13.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AbstractTest.class,
        BuilderTest.class,
        FactoryMethodTest.class,
        PrototypeTest.class,
        SingletonTest.class
})
public class TestSuite {
}
