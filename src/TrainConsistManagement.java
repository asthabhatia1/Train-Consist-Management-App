import java.util.ArrayList;
import java.util.List;

// Base class for all bogies
abstract class Bogie {
    protected String id;

    public Bogie(String id) {
        this.id = id;
    }

    public abstract String getDetails();
}

// Passenger Bogie
class PassengerBogie extends Bogie {
    private String type;
    private int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        super(id);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String getDetails() {
        return "Passenger Bogie [ID=" + id + ", Type=" + type + ", Capacity=" + capacity + "]";
    }
}

// Goods Bogie
class GoodsBogie extends Bogie {
    private String shape;
    private String cargoType;

    public GoodsBogie(String id, String shape, String cargoType) {
        super(id);
        this.shape = shape;
        this.cargoType = cargoType;
    }

    @Override
    public String getDetails() {
        return "Goods Bogie [ID=" + id + ", Shape=" + shape + ", Cargo=" + cargoType + "]";
    }
}

// Train class
class Train {
    private String engineId;
    private List<Bogie> bogies;

    public Train(String engineId) {
        this.engineId = engineId;
        this.bogies = new ArrayList<>();
    }

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public void displayConsist() {
        System.out.println("=== Train Consist Summary ===");
        System.out.println("Engine ID: " + engineId);
        System.out.println("Total Bogies: " + bogies.size());

        for (Bogie b : bogies) {
            System.out.println(b.getDetails());
        }
    }
}

// Main class
public class TrainConsistManagement {
    public static void main(String[] args) {

        // Initialize train
        Train train = new Train("ENG-001");

        // Add passenger bogies
        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 50));

        // Add goods bogie
        train.addBogie(new GoodsBogie("G1", "Rectangular", "Coal"));

        // Display consist summary
        train.displayConsist();
    }
}