package secondhomework;

public class Team {

    private String team;
    private int ranking;

    public Team() {
    }

    public Team(String team, int ranking) {
        this.team = team;
        this.ranking = ranking;
    }

    public void setRanking() {
        this.ranking = ranking;
    }


    public String getTeam() {
        return team;
    }

    public int getRanking() {
        return ranking;
    }

}
