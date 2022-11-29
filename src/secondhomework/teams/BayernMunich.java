package secondhomework.teams;


import secondhomework.person.Coach;
import secondhomework.person.Player;

public class BayernMunich {

    //Coach
    private Coach dt = new Coach("Julian", "Nagelsmann", 35, "Manager");

    //Improve Player definition (private/protected?)
    //Create a bench (players subbing in for starter lineup)

    //Goalkeeper
    Player playerOne = new Player("Manuel", "Neuer", 36, "GK", 90);


    //Defenders
    Player playerTwo = new Player("Matthijs", "de Ligt", 23, "DF", 85);
    Player playerThree = new Player("Benjamin", "Pavard", 26, "DF", 80);
    Player playerFour = new Player("Joshua", "Kimmich", 27, "DF", 89);
    Player playerFive = new Player("Dayot", "Upamecano", 24, "DF", 81);

    //Midfield
    Player playerSix = new Player("Leon", "Goretzka", 27, "MF", 87);
    Player playerSeven = new Player("Sadio", "Mané", 26, "MF", 89);
    Player playerEight = new Player("Jamal", "Musiala", 19, "MF", 82);


    //Forwards
    Player playerNine = new Player("Kingsley", "Coman", 26, "FW", 86);
    Player playerTen = new Player("Serge", "Gnabry", 27, "FW", 84);
    Player playerEleven = new Player("Maxim", "Choupo-Moting", 33, "FW", 75);


    private Player[] playersBayern = {
            playerOne, playerTwo, playerThree, playerFour,
            playerFive, playerSix, playerSeven, playerEight, playerNine,
            playerTen, playerEleven
    };

    public void setPlayersBayern(Player[] players) {
        this.playersBayern = players;
    }

    public Player[] getPlayersBayern() {
        return playersBayern.clone();
    }

    public void setDt(Coach dt) {
        this.dt = dt;
    }

    public Coach getDt() {
        return dt;
    }

    public static void info() {

        /*

        TO-DO
        for (Player player : players) {
            System.out.println(player.toString());
        }
        */
    }
}
