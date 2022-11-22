package secondhomework;

public class Player extends Person {

    private String position;

    public Player(String firstName, String lastName, int age, String position) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String toString() {
        return "Position: " + position + " - Fullname: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
