package za.ac.cput.commandPattern;

/**
 * Created by student on 2015/03/13.
 */
public class PointOfSell {

    private static PointOfSell pos = null;

    public static PointOfSell getPosaInstance(){
        if(pos==null)
            return new PointOfSell();
        else
            return pos;
    }
    public String makePointOfSell(){
        return "creating point of sell";
    }
}
