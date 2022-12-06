package secondhomework.src.project.person;

public class Player extends Person {

    private String position;
    private int rating;

    //Add more attributes like the amount of goals, amount of yellow/red cards (2 yellow = 1 red)
    //Add more methods like penalty, free kick, corner?

    public Player(String firstName, String lastName, int age, String position, int rating) {
        super(firstName, lastName, age);
        this.position = position;
        this.rating = rating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Position: " + position + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge() + " - Rating: " + rating;
    }
}
