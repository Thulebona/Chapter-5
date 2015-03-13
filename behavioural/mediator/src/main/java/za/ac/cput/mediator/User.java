package za.ac.cput.mediator;

/**
 * Created by student on 2015/03/13.
 */
public class User {

    private String number;

    public User(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public String SendMsg(String msg){
      return  ChartRoom.ShowMessage(this,msg);
    }
}