package za.ac.cput.engineAdapter;

/**
 * Created by student on 2015/03/10.
 */
public class Currency {
    double currency;
    private static Currency curr=null;

    public static Currency getInstanceOfc(){
        if(curr==null){
            return new Currency();
        }
        else
            return curr;
    }
    public Currency() {
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }
}
