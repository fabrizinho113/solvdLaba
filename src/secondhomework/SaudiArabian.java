package secondhomework;

public class SaudiArabian {

    public static void info() {

        //Goalkeeper
        Player playerOne = new Player("Abdullah", "Al-Mayouf", 35, "GK");

        //Defenders
        Player playerTwo = new Player("Abdulelah", "Al-Amri", 25, "DF");
        Player playerThree = new Player("Ahmed", "Sharahili", 28, "DF");
        Player playerFour = new Player("Sami", "Al Khaibari", 33, "DF");
        Player playerFive = new Player("Saeed", "Al-Rubaie", 28, "DF");
        Player playerSix = new Player("Hassan", "Tombakti", 23, "DF");

        //Midfield

        Player playerSeven = new Player("Abdulellah", "Al-Malki", 28, "MF");
        Player playerEight = new Player("Hussain", "Al-Qahtani", 27, "MF");
        Player playerNine = new Player("Mukhtar", "Ali", 25, "MF");
        Player playerTen = new Player("Abdullah", "Ateef", 30, "MF");

        //Forwards

        Player playerEleven = new Player("Saleh", "Al Shehri", 29, "FW");

        Player[] players = {
                playerOne, playerTwo, playerThree, playerFour,
                playerFive, playerSix, playerSeven, playerEight, playerNine,
                playerTen, playerEleven
        };

        for (Player player : players) {
            System.out.println(player.toString());
        }

        //Coach
        Coach dt = new Coach("Hervé", "Renard", 54, "Manager");
        System.out.println(dt.toString());
    }
}
