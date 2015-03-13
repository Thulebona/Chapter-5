package za.ac.cput.builderPattern;

/**
 * Created by student on 2015/03/07.
 */
public class PlayerDirector {
    private  PlayerBuilder pBuilder =null;

    public PlayerDirector(PlayerBuilder pBuilder){
        this.pBuilder =pBuilder;
    }
    public void constructPlayer(){
        pBuilder.buildName();
        pBuilder.buildAge();
        pBuilder.buildPosition();
        pBuilder.buildJNumber();
        pBuilder.buildTeam();
        pBuilder.buildSportType();
    }
    public Player getPlayer(){
        return pBuilder.getPlayer();
    }
}
