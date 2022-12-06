package secondhomework.src.project.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import secondhomework.src.project.exceptions.InvalidLeague;
import secondhomework.src.project.exceptions.InvalidOption;


public class Main {

    public static final Logger LOGGER = (Logger) LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Welcome! \n");

        int option = 0;

        //Menu
        Menu.showMenu();
        //Selected option

        try {
            option = Menu.selectOption();
        } catch (InvalidOption e) {
            LOGGER.warn(e.getMessage());
        }

        switch (option) {
            case 1:
                try {
                    option = Menu.selectLeague();
                } catch (InvalidLeague e) {
                    LOGGER.warn(e.getMessage());
                }

                
            case 2:
                System.out.println("Real Madrid: ");
                Match.secondTeamPlayers();
                    /*
                    System.out.println("\nFormation: ");
                    Formation lineupSau = new Formation(5, 4, 1);
                    System.out.println(lineupSau.toString());
                     */
                break;
            case 3:
                System.out.println("Referees assigned for the match (WIP): \n");
                    /*
                    Referee mainRef = new Referee("Danny", "Makkelie", 39, "Main Referee");
                    Referee lineJudgeOne = new Referee("Antonio", "Mateu Lahoz", 45, "Line Judge");
                    Referee lineJudgeTwo = new Referee("Said", "Martinez", 31, "Line Judge");

                    //Creating an array
                    Referee[] referees = {mainRef, lineJudgeOne, lineJudgeTwo};

                    //ForEach
                    for (Referee referee : referees) {
                        System.out.println(referee.toString());
                    }
                     */
                break;
            case 4:
                System.out.println("(WIP)");
                //Match.play();
                break;
            case 5:
                System.out.println("Exiting program....");

        }


    }
}
