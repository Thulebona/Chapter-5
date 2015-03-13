package za.ac.cput.builderPattern;

/**
 * Created by student on 2015/03/07.
 */
public class Rugby implements PlayerBuilder {
    private  Player player;


    public Rugby(){
        player =new Player();

    }
    @Override
    public void buildName() {
        player.setName("John Peter");
    }

    @Override
    public void buildAge() {
        player.setAge(25);
    }

    @Override
    public void buildPosition() {
        player.setPosition("Lock");
    }

    @Override
    public void buildJNumber() {
        player.setjNumber(5);
    }

    @Override
    public void buildTeam() {
        player.setTeam("All White ");
    }

    @Override
    public void buildSportType() {
        player.setSportType("Rugby");
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
