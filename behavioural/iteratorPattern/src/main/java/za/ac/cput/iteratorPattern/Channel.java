package za.ac.cput.iteratorPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Channel {

    private String ChnnlName;
    private int ChnnlNumber;

    public Channel(String chnnlName, int chnnlNumber){
        this.ChnnlName = chnnlName;
        this.ChnnlNumber = chnnlNumber;
    }



    public int getChnnlNumber() {
        return ChnnlNumber;
    }

    public String getChnnlName() {
        return ChnnlName;
    }
}
