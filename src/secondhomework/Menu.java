package secondhomework;

import java.util.Scanner;

public abstract class Menu {

    public static void showMenu() {
        System.out.println("""
                1. Check Team Argentina\s
                2. Check Team Saudi Arabia\s
                3. Check Referees\s
                4. See Match\s
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
