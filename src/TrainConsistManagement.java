import java.util.*;

// Bogie class
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
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
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Step 1: Create List
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Display Before Sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 5: Display After Sorting
        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}