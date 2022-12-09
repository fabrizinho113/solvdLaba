package secondhomework.src.project.collections;

import secondhomework.src.project.teams.Club;

import java.util.ArrayList;
import java.util.List;

import static secondhomework.src.project.schedule.League.*;
import static secondhomework.src.project.teams.Country.*;


public class Clubs {

    private List<Club> laLiga = new ArrayList<>();
    private List<Club> premierLeague = new ArrayList<>();
    private List<Club> ligueOne = new ArrayList<>();

    public Clubs() {
        this.laLiga.add(new Club("Real Madrid", 3, SPAIN, LA_LIGA));
        this.premierLeague.add(new Club("Manchester City", 4, ENGLAND, PREMIER_LEAGUE));
        this.premierLeague.add(new Club("Arsenal", 8, ENGLAND, PREMIER_LEAGUE));
        this.ligueOne.add(new Club("Paris Saint-Germain", 6, FRANCE, LIGUE_ONE));
    }

    public List<Club> getLaLiga() {
        return laLiga;
    }

    public List<Club> getPremierLeague() {
        return premierLeague;
    }

    public List<Club> getLigueOne() {
        return ligueOne;
    }

    public Club getLaLigaOption(int option) {
        return this.laLiga.get(option - 1);
    }

    public Club getPremierOption(int option) {
        return this.premierLeague.get(option - 1);
    }

    public Club getLigueOneOption(int option) {
        return this.ligueOne.get(option - 1);
    }
}
