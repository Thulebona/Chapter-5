package za.ac.cput.abstractFactory;

/**
 * Created by student on 2015/03/07.
 */
public class AbstractFactory {
    private static AbstractFactory af=null;

    private AbstractFactory() {
    }

    public static AbstractFactory getAbstrctF(){
        if(af==null){
            af = new AbstractFactory();
        }
        return af;
    }

    public FactoryType getFactory(String fact){

        if("vehicle".equalsIgnoreCase(fact)){
            return new VehicleFactory();
        }else
            return new ShipFactory();
    }
}
