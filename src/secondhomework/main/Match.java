package secondhomework.main;

import secondhomework.person.Player;
import secondhomework.teams.BayernMunich;
import secondhomework.teams.RealMadrid;

public class Match {

    //Need massive improvements to the logic. A match is 90 minutes long, score starts at 0-0
    /*Ideas:
     *attribute like int time = 0 (maybe divide in minutes:seconds?)
     *simulate the match with more actions (random)
     *goalkeepers can score in penalties and free kicks
     *goals: normal occasions the goalkeeper is not supposed to score (or have extreme low chances to do so)
     *
     *
     *
     * */

    final static BayernMunich bayern = new BayernMunich();
    final static Player[] bayernArray = bayern.getPlayersBayern();

    final static RealMadrid realMadrid = new RealMadrid();

    final static Player[] realArray = realMadrid.getPlayersRealM();


    public static void firstTeamPlayers() {
        for (Player player : bayernArray) {
            System.out.println(player.toString());
        }
    }

    public static void secondTeamPlayers() {
        for (Player player : bayernArray) {
            System.out.println(player.toString());
        }
    }

    public static void play() {


        //First attempt with Argentina vs Saudi Arabian
        /*
        //if inline -  condition ? true : false
        String fav = arg.getRanking() < sau.getRanking() ?
                "Argentina is the favorite for this match"
                :
                "Saudi Arabian is is the favorite for this match";

        //Print outcome of the if inline
        System.out.println(fav);

        //Chances for each team to win ( 1 to 3 "goals")
        int argOdds = (int) (Math.random() * 3 + 1);
        int sauOdds = (int) (Math.random() * 3 + 1);


        //Winner of the match
        String winner = argOdds > sauOdds ? "Argentina won!" : "Saudi Arabian won!";
        System.out.println(winner);
         */


    }
}
