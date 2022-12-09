package secondhomework.src.project.teams;

import secondhomework.src.project.schedule.League;

import java.util.Objects;

public class Club {

    private String name;
    private int ranking;

    private Country country;

    private League league;

    //Add more attributes? (fans)

    public Club() {
    }

    public Club(String name, int ranking, Country country, League league) {
        this.name = name;
        this.ranking = ranking;
        this.country = country;
        this.league = league;
    }

    public Club(String name, int ranking, String country, League league) {
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

    public Country getCountry() {
        return country;
    }

    public League getLeague() {
        return league;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Club: " + this.name + "\n Ranking: " +
                this.ranking + "\n Country: " + this.country + "\n League: " + this.league;
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
