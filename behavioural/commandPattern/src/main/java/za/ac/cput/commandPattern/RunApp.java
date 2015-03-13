package za.ac.cput.commandPattern;

/**
 * Created by student on 2015/03/13.
 */
public class RunApp {
    Command command;

    public RunApp(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String Run(){
        return command.execute();
    }
}
