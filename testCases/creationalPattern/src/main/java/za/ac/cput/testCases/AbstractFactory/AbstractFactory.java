package za.ac.cput.testCases.AbstractFactory;

/**
 * Created by student on 2015/03/13.
 */
public class AbstractFactory {
    public SubjectsFactory  getSubjectYear(String year){
        if("second".equalsIgnoreCase(year))
            return new SecondYearSubjectsFactory();
        else
            return new ThirdYearSubjectsFactory();
    }
}
