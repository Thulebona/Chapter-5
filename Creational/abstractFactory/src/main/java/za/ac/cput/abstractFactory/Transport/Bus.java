package za.ac.cput.abstractFactory.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class Bus implements Transport {
    @Override
    public String getName() {
        return "Bus";
    }

    @Override
    public String getType() {
        return "Passenger";
    }
}
