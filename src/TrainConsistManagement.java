import java.util.LinkedHashSet;

public class TrainConsistManagement {
    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        train.add("Sleeper"); // duplicate - will be ignored

        // Display final formation
        System.out.println("Final Train Formation (Ordered & Unique):");
        System.out.println(train);
    }
}