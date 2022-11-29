package secondhomework.building;

import java.util.Objects;

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
    public String toString() {
        return "Stadium: " + name + "\n Capacity: " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stadium stadium = (Stadium) o;
        return capacity == stadium.capacity && name.equals(stadium.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
