package za.ac.cput.compositePattern;

/**
 * Created by student on 2015/03/10.
 */
public class Student implements  Test {

    private static Student std=null;
    private String stdNum;
    private float marks;

    private Student(String stdNum,float marks) {
        this.stdNum = stdNum;
        this.marks =  marks;
    }

    public static Student getStudentInst(String stdNum,float marks){
        if(std ==null)
            return new Student(stdNum,marks);
        else
            return std;
    }


    @Override
    public void Results() {
        if(marks>49)
            System.out.println(stdNum+" "+"Passed");
        else
            System.out.println(stdNum+" "+"Failed");
    }
}
