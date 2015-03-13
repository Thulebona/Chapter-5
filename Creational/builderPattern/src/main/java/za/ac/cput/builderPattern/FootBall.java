package za.ac.cput.builderPattern;

/**
 * Created by student on 2015/03/07.
 */
public class FootBall implements PlayerBuilder  {
    private  Player player;


    public FootBall(){
        player =new Player();

    }
    @Override
    public void buildName() {
        player.setName("Ayanda Zulu");
    }

    @Override
    public void buildAge() {
        player.setAge(21);
    }

    @Override
    public void buildPosition() {
        player.setPosition("GoalKeeper");
    }

    @Override
    public void buildJNumber() {
        player.setjNumber(1);
    }

    @Override
    public void buildTeam() {
    player.setTeam("Gqagqa Stars");
    }

    @Override
    public void buildSportType() {
        player.setSportType("FootBall");
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
