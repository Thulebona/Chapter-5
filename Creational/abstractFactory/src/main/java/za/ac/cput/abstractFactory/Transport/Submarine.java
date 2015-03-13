package za.ac.cput.abstractFactory.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class Submarine implements Transport {

    @Override
    public String getName() {
        return "Submarine";
    }

    @Override
    public String getType() {
        return "underwater war ship";
    }
}
