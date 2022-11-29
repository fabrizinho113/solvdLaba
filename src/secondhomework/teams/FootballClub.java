package secondhomework.teams;

public class FootballClub extends Club {

    //Work in Progress. The idea is to have a record for each team everytime the user wants to play (Win-Loss-Draw)
    //Also to keep a record on how many matches was played
    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int matchesPlayed;

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public void setDefeatCount(int defeatCount) {
        this.defeatCount = defeatCount;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public int getDefeatCount() {
        return defeatCount;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }
}
