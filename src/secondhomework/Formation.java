package secondhomework;

public class Formation {

    private int defenders;
    private int midfielders;
    private int forwards;

    public Formation() {
    }

    public Formation(int defenders, int midfielders, int forwards) {
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.forwards = forwards;
    }

    public void setDefenders(int defenders) {
        this.defenders = defenders;
    }

    public void setMidfielders(int midfielders) {
        this.midfielders = midfielders;
    }

    public void setForwards(int forwards) {
        this.forwards = forwards;
    }

    public int getDefenders() {
        return defenders;
    }

    public int getMidfielders() {
        return midfielders;
    }

    public int getForwards() {
        return forwards;
    }

    public String toString() {
        return defenders + "-" + midfielders + "-" + forwards;
    }
}
