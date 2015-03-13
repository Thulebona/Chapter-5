package za.ac.cput.testCases.Singleton;

/**
 * Created by student on 2015/03/13.
 */
public class Calculator {
    private static Calculator calculator = null;
    private Calculator() {
    }
    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
}