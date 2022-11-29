package secondhomework.person;

public class Referee extends Person {

    private String role;

    //Add more attributes unique to a referee. Ex: Yellow/Red cards, call a foul

    public Referee(String firstName, String lastName, int age, String role) {
        super(firstName, lastName, age);
        this.role = role;
    }

    @Override
    public void action() {
        System.out.println("Referee calls a fault!");
    }

    @Override
    public String toString() {
        return "Role: " + role + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
