package za.ac.cput.testCases.AbstractFactory;

/**
 * Created by student on 2015/03/13.
 */
public class SecondYearSubjectsFactory implements SubjectsFactory {
    @Override
    public Subject getSubjectName(String subjectCode) {
        if(subjectCode.equalsIgnoreCase("DOS002"))
        return new SecondYearDS();
        else
            return new SecondYearTP();
    }
}
