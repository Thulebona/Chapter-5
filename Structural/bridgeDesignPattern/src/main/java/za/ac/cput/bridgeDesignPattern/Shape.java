package za.ac.cput.bridgeDesignPattern;

/**
 * Created by student on 2015/03/11.
 */
abstract class Shape {
    Color color;
    Shape(Color color)
    {
        this.color=color;
    }
    abstract public void colorIt();
}
