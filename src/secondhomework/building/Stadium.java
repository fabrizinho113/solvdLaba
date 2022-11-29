package secondhomework.building;

public class Stadium {

    private String name;
    private int capacity;

    public Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Stadium))
            return false;
        Stadium stadium = (Stadium) obj;
        return stadium.getCapacity() == this.getCapacity()
                && stadium.getName() == this.getName();
    }

    @Override
    public int hashCode() {
        int result = 20;
        result = 31 * result + capacity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stadium: " + name + "\n Capacity: " + capacity;
    }

}
