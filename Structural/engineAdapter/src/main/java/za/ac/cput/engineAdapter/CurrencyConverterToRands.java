package za.ac.cput.engineAdapter;

/**
 * Created by student on 2015/03/10.
 */
public class CurrencyConverterToRands extends Currency implements CurrencyInD {

    private static CurrencyConverterToRands toRand=null;

    public static CurrencyConverterToRands getInstanceOfRand(){
        if(toRand==null){
            return  new CurrencyConverterToRands();
        }
        else
            return  toRand;
    }
    private double dollersToRands(double amount){
        return amount*10;
    }
    private double randsToDollers(double amount){
        return amount/10;
    }


    @Override
    public void setCurrencyInD(double currency) {
        this.currency =currency;
    }
    @Override
    public void setCurrencyInR(double currency) {
        this.currency = currency;

    }

    @Override
    public double getCurrencyInR() {
        return currency;
    }
    @Override
    public double getCurrencyInD() {
        return dollersToRands(currency);
    }


}
