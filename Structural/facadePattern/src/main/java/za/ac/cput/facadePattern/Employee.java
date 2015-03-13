package za.ac.cput.facadePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Employee {
    private static Employee emp =null;

    public static Employee getEmpInstance() {
        if(emp==null)
        return new Employee();
        else
            return emp;
    }

    private Employee() {
    }

    public float getEmployeeSal(int hours){
        return 100*hours;
    }

}
