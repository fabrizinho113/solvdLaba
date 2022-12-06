package secondhomework.src.project.person;

public class Referee extends Person {

    private String role;

    //Add more attributes unique to a referee. Ex: Yellow/Red cards, call a foul

    public Referee(String firstName, String lastName, int age, String role) {
        super(firstName, lastName, age);
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role: " + role + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
