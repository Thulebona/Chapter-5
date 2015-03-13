package za.ac.cput.decoratorPattern;

/**
 * Created by student on 2015/03/12.
 */
public class VehicleDecorator implements Transport {
    protected Transport trans;

    public VehicleDecorator(Transport trans){
        this.trans = trans;
    }
    @Override
    public String carType(String car) {
        return this.trans.carType("Vehicle")+" "+car;
    }
}
