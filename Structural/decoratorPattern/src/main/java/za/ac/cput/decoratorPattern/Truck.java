package za.ac.cput.decoratorPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Truck extends VehicleDecorator{

    public Truck(Transport trans) {
        super(trans);
    }
    @Override
    public String carType(String car){
        return trans.carType("Truck")+" "+car;
    }
}
