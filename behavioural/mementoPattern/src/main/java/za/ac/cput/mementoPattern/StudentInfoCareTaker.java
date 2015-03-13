package za.ac.cput.mementoPattern;

/**
 * Created by student on 2015/03/13.
 */
public class StudentInfoCareTaker {

    Object objMemento;
    public void saveState(StudentInfor studentInfor){
        objMemento = studentInfor.save();
    }
    public void restore(StudentInfor studentInfor){
        studentInfor.restore(objMemento);
    }
}
