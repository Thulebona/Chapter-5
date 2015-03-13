package za.ac.cput.builderPattern;

/**
 * Hello world!
 *
 */
public class Player{

    private String name;
    private int age;
    private String position;
    private int jNumber;
    private String team;
    private String sportType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getjNumber() {
        return jNumber;
    }

    public void setjNumber(int jNumber) {
        this.jNumber = jNumber;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nPosition: "+position+"\nJersey Number: "+jNumber+
                "\nTeam: "+team+"\nSport Type: "+sportType;
    }
}
