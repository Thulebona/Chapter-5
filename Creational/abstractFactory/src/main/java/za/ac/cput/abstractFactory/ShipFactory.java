package za.ac.cput.abstractFactory;

import za.ac.cput.abstractFactory.Transport.FerryBoat;
import za.ac.cput.abstractFactory.Transport.Submarine;
import za.ac.cput.abstractFactory.Transport.Transport;

/**
 * Created by student on 2015/03/07.
 */
public class ShipFactory extends FactoryType {
    @Override
    public Transport getTransport(String typ) {
       if("Ferry".equalsIgnoreCase(typ)) {
           return new FerryBoat();
       }else
           return new Submarine();
    }
}
