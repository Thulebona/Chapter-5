package za.ac.cput.singleton;

/**
 * Created by student on 2015/03/04.
 */
public class CalculateR_Area{

    private static CalculateR_Area calcArea= null;

    private CalculateR_Area() {
    }

    public static CalculateR_Area getInstance(){
        if(calcArea ==null){
            calcArea = new CalculateR_Area();
        }
        return calcArea;
    }

    public double calculate(double w, double l) {
        return w*l;
    }
}
