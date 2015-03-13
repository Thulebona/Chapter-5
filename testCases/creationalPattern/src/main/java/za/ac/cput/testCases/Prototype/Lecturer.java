package za.ac.cput.testCases.Prototype;

/**
 * Created by student on 2015/03/13.
 */
public class Lecturer implements CloneObject{
    private String name;
    public Lecturer(String name) {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy() {
        return new Lecturer(name);
    }
    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
