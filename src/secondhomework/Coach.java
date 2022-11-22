package secondhomework;

public class Coach extends Person {

    private String job;

    public Coach(String firstName, String lastName, int age, String job) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.job = job;
    }

    public String toString() {
        return "Job: " + job + " - Full name: " + getFirstName() + " " + getLastName() + " - Age: " + getAge();
    }
}
