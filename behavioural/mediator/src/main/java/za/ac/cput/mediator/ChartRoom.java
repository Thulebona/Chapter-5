package za.ac.cput.mediator;

import java.util.Date;

/**
 * Created by student on 2015/03/13.
 */
public class ChartRoom {

    public static String ShowMessage(User user,String message){
        String msg =new Date().toString()+"\n"+user.getNumber()+"\n"+ message;
        return msg;
    }
}
