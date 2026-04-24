class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

            System.out.println("Valid Bogies Created:");
            System.out.println(b1);
            System.out.println(b2);

            // Invalid bogies (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            PassengerBogie b4 = new PassengerBogie("Luxury", -10);

            System.out.println(b3);
            System.out.println(b4);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}