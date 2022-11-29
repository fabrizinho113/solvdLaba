package secondhomework.teams;

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
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Club))
            return false;
        Club club = (Club) obj;
        return club.getRanking() == this.getRanking()
                && club.getName() == this.getName();
    }
}
