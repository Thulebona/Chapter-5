package za.ac.cput.testCases.AbstractFactory;

/**
 * Created by student on 2015/03/13.
 */
public class ThirdYearSubjectsFactory implements SubjectsFactory{
    @Override
    public Subject getSubjectName(String subjectCode) {
        if(subjectCode.equalsIgnoreCase("DOS003"))
        return new ThirdYearDS();
        else
            return new ThirdYearTP();
    }
}