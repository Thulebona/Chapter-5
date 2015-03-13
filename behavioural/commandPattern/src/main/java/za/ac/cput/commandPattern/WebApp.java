package za.ac.cput.commandPattern;

/**
 * Created by student on 2015/03/13.
 */
public class WebApp implements Command{

    Web web;
    private static WebApp wa= null;

    public static WebApp getWebInstance(Web web){
        if(wa==null)
            return new WebApp(web);
        else
            return wa;
    }

    private WebApp(Web web) {
        this.web = web;
    }

    @Override
    public String execute() {
        return web.makeWeb();
    }
}
