package za.ac.cput.strategyPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Context {

    private static Context ourInstance = null;
    private Calculator calc;

    public static Context getInstance(Calculator calc) {
        if(ourInstance==null)
            return  new  Context(calc);
        else
            return ourInstance;
    }

    private Context(Calculator calc) {
         this.calc = calc;
    }

    public int makeCalculations(int num1, int num2){
        return calc.doCalculation(num1,num2);
    }
}
