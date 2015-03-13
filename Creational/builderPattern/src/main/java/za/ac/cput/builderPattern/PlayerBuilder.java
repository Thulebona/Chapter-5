package za.ac.cput.builderPattern;

/**
 * Created by student on 2015/03/07.
 */
public interface PlayerBuilder{
    public void buildName();
    public void buildAge();
    public void buildPosition();
    public void buildJNumber();
    public void buildTeam();
    public void buildSportType();
    public Player getPlayer();
}