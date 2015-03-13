package za.ac.cput.engineAdapter;

/**
 * Created by student on 2015/03/10.
 */
class CurrencyConverterToDols implements CurrencyInD {

    private static CurrencyConverterToDols  toDol =null;
    Currency curr;

    private CurrencyConverterToDols() {
        curr =Currency.getInstanceOfc();
    }

    public static CurrencyConverterToDols getInstanceOfDol(){
        if(toDol==null){
            return  new CurrencyConverterToDols();
        }
        else
            return  toDol;
    }

    private double dollersToRands(double dol){
        return dol*10;
    }
    private double randsToDollers(double rand){
        return rand/10;
    }

    @Override
    public void setCurrencyInR(double currency) {
        curr.setCurrency(currency);
    }

    @Override
    public void setCurrencyInD(double currency) {
        curr.setCurrency(currency);
    }


    @Override
    public double getCurrencyInR() {
        return randsToDollers(curr.getCurrency()) ;
    }
    @Override
    public double getCurrencyInD() {
        return curr.getCurrency();
    }

}
