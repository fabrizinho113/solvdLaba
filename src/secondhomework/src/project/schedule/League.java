package secondhomework.src.project.schedule;

public enum League {
    PREMIER_LEAGUE("Premier League"), //England
    LIGUE_ONE("Ligue 1"), //France
    LA_LIGA("La Liga"), //Spain
    SERIE_A("Serie A"), //Italy
    BUNDESLIGA("Bundesliga"),//Germany
    EREDIVISIE("Eredivisie"),//Netherlands
    PRIMEIRA_LIGA("Primeira Liga"); //Portugal


    String league;

    League(String league) {
        this.league = league;
    }
}
