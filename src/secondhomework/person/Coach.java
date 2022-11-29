package secondhomework.person;

public class Coach extends Person {

    private String job;

    //Add more attributes and methods unique to a coach. Ex: indications, changeFormation, changePlayer

    public Coach(String firstName, String lastName, int age, String job) {
        super(firstName, lastName, age);
        this.job = job;
    }


    public void action() {
        System.out.println("Coach is instructing the players!");
    }

    public String toString() {
        return "Job: " + job + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
