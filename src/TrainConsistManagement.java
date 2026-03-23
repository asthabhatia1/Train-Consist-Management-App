import java.util.LinkedList;


public class TrainConsistManagement {
    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies in order
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1-based → index 1 or 2 depending interpretation)
        train.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 3:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}