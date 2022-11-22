package secondhomework;

public class Referee extends Person {

    private String role;

    public Referee(String firstName, String lastName, int age, String role) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.role = role;
    }

    public String toString() {
        return "Role: " + role + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
