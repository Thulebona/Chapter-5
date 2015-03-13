package za.ac.cput.abstractFactory.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class FerryBoat implements Transport {
    @Override
    public String getName() {
        return "Ferry";
    }

    @Override
    public String getType() {
        return "Passenger Ship";
    }
}
