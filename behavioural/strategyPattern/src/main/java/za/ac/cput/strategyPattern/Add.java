package za.ac.cput.strategyPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Add implements Calculator {
    @Override
    public int doCalculation(int num1, int num2) {
        return num1 + num2;
    }
}
