package secondhomework.teams;

import java.util.Objects;

public abstract class Club {

    private String name;
    private int ranking;

    //Add more attributes? (fans)

    public Club() {
    }

    public Club(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String team) {
        this.name = team;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking() {
        this.ranking = ranking;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Club club = (Club) o;
        return ranking == club.ranking && name.equals(club.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ranking);
    }
}
