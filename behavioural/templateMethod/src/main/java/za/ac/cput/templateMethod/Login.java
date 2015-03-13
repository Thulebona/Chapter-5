package za.ac.cput.templateMethod;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Login {


    String user;
    String pas;

    public final void login(){
        getApp();
        enterUserDetails( user,  pas);
        validateDetails(user,  pas);
        logout();
    }

    protected abstract String getApp();

    protected abstract String logout();

    public abstract boolean validateDetails(String user, String pas);

    public abstract String enterUserDetails(String user, String pas);
}
