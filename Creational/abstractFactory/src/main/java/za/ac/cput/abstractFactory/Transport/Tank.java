package za.ac.cput.abstractFactory.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class Tank implements Transport {
    @Override
    public String getName() {
        return "Tank";
    }

    @Override
    public String getType() {
        return "war";
    }
}
