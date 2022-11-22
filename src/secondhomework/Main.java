package secondhomework;


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome! \n");

        //Menu
        Menu.showMenu();
        //Selected option
        int option = Menu.selectOption();

        do {

            switch (option) {
                case 1:
                    System.out.println("Argentina: ");
                    Argentina.info();
                    System.out.println("\nFormation: ");
                    Formation lineupArg = new Formation(4, 3, 3);
                    System.out.println(lineupArg.toString());
                    break;
                case 2:
                    System.out.println("Saudi Arabian: ");
                    SaudiArabian.info();
                    System.out.println("\nFormation: ");
                    Formation lineupSau = new Formation(5, 4, 1);
                    System.out.println(lineupSau.toString());
                    break;
                case 3:
                    System.out.println("Referees assigned for the match: \n");
                    
                    Referee mainRef = new Referee("Danny", "Makkelie", 39, "Main Referee");
                    Referee lineJudgeOne = new Referee("Antonio", "Mateu Lahoz", 45, "Line Judge");
                    Referee lineJudgeTwo = new Referee("Antonio", "Mateu Lahoz", 45, "Line Judge");

                    Referee[] referees = {mainRef, lineJudgeOne, lineJudgeTwo};
                    for (Referee referee : referees) {
                        System.out.println(referee.toString());
                    }
                    break;
                case 4:
                    Match.odds();
                    break;
                case 5:
                    System.out.println("Exiting program....");
                default:
                    System.out.println("Invalid number, try again.");
                    break;

            }

            option = Menu.selectOption();

        } while (option != 6);


    }
}
