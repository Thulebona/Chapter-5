package za.ac.cput.commandPattern;

/**
 * Created by student on 2015/03/13.
 */
public class PointOfSellApp implements  Command {

    private static PointOfSellApp posa = null;
    PointOfSell pos;

    private PointOfSellApp(PointOfSell pos) {
        this.pos =pos;
    }

    public static PointOfSellApp getPosaInstance(PointOfSell pos){
        if(posa==null)
            return new PointOfSellApp(pos);
        else
            return posa;
    }

    @Override
    public String execute() {
        return pos.makePointOfSell();
    }
}
