import java.util.*;
import java.util.function.Predicate;

class GoodsBogie {
    private String shape;   // Rectangular / Cylindrical
    private String cargo;   // Coal / Petroleum / etc.

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + cargo;
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));        // ❌ unsafe
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Rectangular", "Steel"));

        // Step 2: Safety rule using Predicate (functional interface)
        Predicate<GoodsBogie> safetyRule = b ->
                !(b.getShape().equals("Cylindrical") && !b.getCargo().equals("Petroleum"));

        // Step 3: Apply safety filter using Stream
        List<GoodsBogie> safeBogies = bogies.stream()
                .filter(safetyRule)
                .toList();

        // Step 4: Display results
        System.out.println("All Goods Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nSafe Compliant Bogies:");
        safeBogies.forEach(System.out::println);
    }
}