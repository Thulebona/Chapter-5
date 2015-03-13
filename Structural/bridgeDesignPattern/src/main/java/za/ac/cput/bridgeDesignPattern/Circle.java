package za.ac.cput.bridgeDesignPattern;

/**
 * Created by student on 2015/03/11.
 */

public class Circle extends Shape{

    Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}