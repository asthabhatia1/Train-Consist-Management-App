import java.util.*;
import java.util.stream.Collectors;

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
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Display bogies
        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        // Step 3: Aggregate total capacity using map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // Extract capacity
                .reduce(0, Integer::sum);   // Sum all values

        // Step 4: Display total seating capacity
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}