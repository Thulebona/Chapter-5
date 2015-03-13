package za.ac.cput.statePattern;

/**
 * Created by student on 2015/03/13.
 */
public class Laptop implements PowerSate {

    private PowerSate ps;
    private static Laptop lp = null;

    private Laptop(PowerSate ps) {
        this.ps =ps;
    }

    public static Laptop getLapInstance(PowerSate ps)
    {
        if(lp==null)
            return new Laptop(ps);
        else
            return lp;
    }

    public void setPs(PowerSate ps) {
        this.ps = ps;
    }

    @Override
    public String performance() {
        return ps.performance();
    }
}
