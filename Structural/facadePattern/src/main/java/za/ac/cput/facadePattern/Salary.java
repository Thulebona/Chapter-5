package za.ac.cput.facadePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Salary {
    private Employee empl =null;
    private Manager mnger =null;

    private static Salary sal=null;

    private Salary(){
        empl = Employee.getEmpInstance();
        mnger = Manager.getManagerInstance();
    }

    public static Salary getSalaryInstance(){
        if(sal==null)
            return new Salary();
        else
            return sal;
    }
    public float getMonthlySal(int hours, String emp){
        if(emp.substring(0,3).equalsIgnoreCase("emp"))
            return empl.getEmployeeSal(hours);
        else
            return mnger.getManagerSal(hours);
    }
}
