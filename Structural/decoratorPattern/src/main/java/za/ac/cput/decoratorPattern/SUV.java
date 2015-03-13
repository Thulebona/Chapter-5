package za.ac.cput.decoratorPattern;

/**
 * Created by student on 2015/03/12.
 */
public class SUV extends  VehicleDecorator {

    public SUV(Transport trans) {
        super(trans);
    }
    @Override
    public String carType(String car){
        return trans.carType("SUV")+" "+car;
    }
}
