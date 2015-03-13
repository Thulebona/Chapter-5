package za.ac.cput.abstractFactory;

import za.ac.cput.abstractFactory.Transport.Bus;
import za.ac.cput.abstractFactory.Transport.Tank;
import za.ac.cput.abstractFactory.Transport.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class VehicleFactory extends FactoryType {
    @Override
    public Transport getTransport(String typ) {
        if("Tank".equalsIgnoreCase(typ)){
            return new Tank();
        }
        else
            return new Bus();
    }
}
