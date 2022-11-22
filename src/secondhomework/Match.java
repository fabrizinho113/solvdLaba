package secondhomework;

public class Match {

    public static void odds() {

        Team arg = new Team("Argentina", 3);
        Team sau = new Team("Saudi Arabian", 51);

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

    }
}
