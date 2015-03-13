package za.ac.cput.testCases.Prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Subject implements CloneObject{
    private String subjectCode;
    public Subject(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    @Override
    public CloneObject makeCopy() {
        return new Subject(subjectCode);
    }
    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                '}';
    }
}