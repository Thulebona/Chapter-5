package za.ac.cput.decoratorPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Vehicle implements Transport{
    @Override
    public String carType(String car) {
        return car;
    }
}
