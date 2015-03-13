package za.ac.cput.commandPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Web {

    private static Web wb= null;

    public static Web getWebInstance(){
        if(wb==null)
            return new Web();
        else
            return wb;
    }

    public String makeWeb(){
        return "Creating Web";
    }
}
