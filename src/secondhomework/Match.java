package secondhomework;

public class Match {

    public static void odds() {
        Team arg = new Team("Argentina", 3);
        Team sau = new Team("Saudi Arabian", 51);

        String fav = arg.getRanking() < sau.getRanking() ?
                "Argentina is the favorite for this match"
                :
                "Saudi Arabian is is the favorite for this match";

        System.out.println(fav);

        int bonusArg = 0;
        int bonusSau = 0;
        int argOdds = (int) (Math.random() * 3 + 1) + bonusArg;
        int sauOdds = (int) (Math.random() * 3 + 1) + bonusSau;

        if (arg.getRanking() < sau.getRanking()) {
            bonusArg = 3;
        } else {
            bonusSau = 3;
        }

        String winner = argOdds > sauOdds ? "Argentina won!" : "Saudi Arabian won!";
        System.out.println(winner);

    }
}
