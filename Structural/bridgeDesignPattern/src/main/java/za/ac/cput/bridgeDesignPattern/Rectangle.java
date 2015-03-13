package za.ac.cput.bridgeDesignPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Rectangle extends Shape{

    Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}

