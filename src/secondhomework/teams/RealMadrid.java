package secondhomework.teams;

import secondhomework.person.Coach;
import secondhomework.person.Player;

public class RealMadrid {

    //Coach

    private Coach dt = new Coach("Carlo", "Ancelotti", 63, "Manager");

    //Improve Player definition (private/protected?)
    //Create a bench (players subbing in for starter lineup)


    //Goalkeeper
    Player playerOne = new Player("Thibaut", "Courtois", 30, "GK", 90);

    //Defenders
    Player playerTwo = new Player("Ferland", "Mendy", 27, "DF", 83);
    Player playerThree = new Player("David", "Alaba", 30, "DF", 86);
    Player playerFour = new Player("Eder", "Militao", 24, "DF", 84);
    Player playerFive = new Player("Lucas", "Vazquez", 31, "DF", 81);


    //Midfield
    Player playerSix = new Player("Aurelien", "Tchouameni", 22, "MF", 83);
    Player playerSeven = new Player("Toni", "Kroos", 32, "MF", 88);
    Player playerEight = new Player("Luka", "Modric", 37, "MF", 88);


    //Forwards
    Player playerNine = new Player("Vinicius", "Junior", 22, "FW", 86);
    Player playerTen = new Player("Federico", "Varverde", 24, "FW", 85);
    Player playerEleven = new Player("Rodrygo", "Silva de Goes", 21, "FW", 81);

    private Player[] playersRealM = {
            playerOne, playerTwo, playerThree, playerFour,
            playerFive, playerSix, playerSeven, playerEight, playerNine,
            playerTen, playerEleven
    };

    public void setPlayersRealM(Player[] players) {
        this.playersRealM = players;
    }

    public Player[] getPlayersRealM() {
        return playersRealM.clone();
    }

    public void setDt(Coach dt) {
        this.dt = dt;
    }

    public Coach getDt() {
        return dt;
    }

    public static void info() {

        /*
        for (Player player : players) {
            System.out.println(player.toString());
        }



        System.out.println(dt.toString());*/
    }
}
