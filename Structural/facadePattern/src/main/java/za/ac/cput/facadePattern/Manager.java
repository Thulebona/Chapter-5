package za.ac.cput.facadePattern;

/**
 * Created by student on 2015/03/11.
 */
public class Manager {

    private static Manager mnger=null;

    public static Manager getManagerInstance(){
        if(mnger==null)
            return new Manager();
        else
            return mnger;
    }

    private Manager(){
    }

    public float getManagerSal(int hours){
        return 160 *hours;
    }
}
