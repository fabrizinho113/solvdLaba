package secondhomework.schedule;

public enum Leagues {
    PREMIER_LEAGUE("Premier League"), //England
    LIGUE_ONE("Ligue 1"), //France
    LA_LIGA("La Liga"), //Spain
    SERIE_A("Serie A"), //Italy
    BUNDESLIGA("Bundesliga"),//Germany
    EREDIVISIE("EREDIVISIE"),//Netherlands
    PRIMEIRA_LIGA("Primeira Liga"); //Portugal


    String league;

    Leagues(String league) {
        this.league = league;
    }
}
