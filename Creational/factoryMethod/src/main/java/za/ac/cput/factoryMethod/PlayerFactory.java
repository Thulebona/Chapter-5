package za.ac.cput.factoryMethod;

/**
 * Created by student on 2015/03/04.
 */
public class PlayerFactory {
    public static Player getPlayerLeague(String type){

        if("PSL".equalsIgnoreCase(type)){
            return new FootballPlayer();
        }
         else{
            return new RubyPlayer();
        }
    }
}
