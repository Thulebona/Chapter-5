package za.ac.cput.templateMethod;

/**
 * Created by student on 2015/03/12.
 */
public class FacebookLog extends Login {

    @Override
    public String getApp() {
        return "facebook";
    }

    @Override
    public String logout() {
        return "signing out";
    }

    @Override
    public boolean validateDetails(String user, String pas) {
        if(user.equalsIgnoreCase("user")&& pas.equalsIgnoreCase("1"))
           return true;
           else
            return false;
    }

    @Override
    public String enterUserDetails(String user, String pas) {
        String msg ="wrong details";
        if(validateDetails(user,pas))
           msg = "logged in";

          return msg;
    }

}

