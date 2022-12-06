package secondhomework.src.project.main;

import secondhomework.src.project.exceptions.InvalidLeague;
import secondhomework.src.project.exceptions.InvalidOption;

import java.util.Scanner;

public abstract class Menu {

    public static void showMenu() {
        System.out.println("""
                1. Check Teams (WIP)\s
                2. Check Champions League (WIP)\s
                3. Check Referees (WIP)\s
                4. See Match (WIP)\s
                5. Exit\s
                """
        );
    }

    public static void showLeagues() {
        System.out.println("Select the league: \n");
        System.out.println("1- Premier League\n" +
                "2- Ligue 1\n" +
                "3- La Liga\n" +
                "4- Serie A\n" +
                "5- Bundesliga\n" +
                "6- Eredivisie\n" +
                "7- Primeira Liga\n");
    }

    public static int selectOption() throws InvalidOption {

        Scanner input = new Scanner(System.in);

        int option;

        option = input.nextInt();

        if (option < 1 || option > 5) {
            throw new InvalidOption("Invalid option");
        }
        return option;
    }

    public static int selectLeague() throws InvalidLeague {
        Scanner input = new Scanner(System.in);
        int option;

        option = input.nextInt();
        if (option < 1 || option > 7) {
            throw new InvalidLeague("Invalid league");
        }
        return option;
    }
}
