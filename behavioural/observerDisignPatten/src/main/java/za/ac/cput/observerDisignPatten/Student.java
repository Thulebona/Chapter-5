package za.ac.cput.observerDisignPatten;

/**
 * Created by student on 2015/03/13.
 */
public class Student implements  Observer {
    @Override
    public String updateYear(String year) {
        return ( "student is doing "+ year +" Year");
    }
}
