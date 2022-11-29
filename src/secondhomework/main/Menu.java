package secondhomework.main;

import java.util.Scanner;

public abstract class Menu {

    public static void showMenu() {
        System.out.println("""
                1. Check first team\s
                2. Check second team\s
                3. Check Referees (WIP)\s
                4. See Match (WIP)\s
                5. Exit\s
                """
        );
    }

    public static int selectOption() {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        input.nextLine();

        return option;
    }
}
