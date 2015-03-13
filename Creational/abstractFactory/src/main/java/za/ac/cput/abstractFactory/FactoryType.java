package za.ac.cput.abstractFactory;

import za.ac.cput.abstractFactory.Transport.Transport;

/**
 * Created by student on 2015/03/07.
 */
public abstract class FactoryType {

    public abstract Transport getTransport(String typ);

}
