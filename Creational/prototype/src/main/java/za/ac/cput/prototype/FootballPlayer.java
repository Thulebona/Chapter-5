package za.ac.cput.prototype;

/**
 * Created by student on 2015/03/09.
 */
public class FootballPlayer implements ClonePlayer {

    private String position;
    private String team;

    public FootballPlayer(String position, String team) {
        this.position = position;
        this.team = team;
    }

    @Override
    public ClonePlayer makeCopy() {
        return new FootballPlayer(position,team);
    }

    @Override
    public String toString() {
        return "Position: " + position +"\n" +"Team=" + team + "\n";
    }
}
