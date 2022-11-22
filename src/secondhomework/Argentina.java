package secondhomework;


public class Argentina {

    public static void info() {

        //Goalkeeper
        Player playerOne = new Player("Emiliano", "Martinez", 30, "GK");

        //Defenders
        Player playerTwo = new Player("Nicolas", "Otamendi", 34, "DF");
        Player playerThree = new Player("Nahuel", "Molina", 24, "DF");
        Player playerFour = new Player("Nicolas", "Tagliafico", 30, "DF");
        Player playerFive = new Player("Cristian", "Romero", 24, "DF");


        //Midfield
        Player playerSix = new Player("Rodrigo", "De Paul", 28, "MF");
        Player playerSeven = new Player("Leandro", "Paredes", 28, "MF");
        Player playerEight = new Player("Alejandro", "Gomez", 34, "MF");


        //Forwards
        Player playerNine = new Player("Angel", "Di Maria", 34, "FW");
        Player playerTen = new Player("Lionel", "Messi", 35, "FW");
        Player playerEleven = new Player("Julian", "Alvarez", 22, "FW");

        Player[] players = {
                playerOne, playerTwo, playerThree, playerFour,
                playerFive, playerSix, playerSeven, playerEight, playerNine,
                playerTen, playerEleven
        };

        for (Player player : players) {
            System.out.println(player.toString());
        }

        //Coach
        Coach dt = new Coach("Lionel", "Scaloni", 44, "Manager");
        System.out.println(dt.toString());
    }
}
