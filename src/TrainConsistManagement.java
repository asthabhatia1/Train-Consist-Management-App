class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargo) {
        try {
            // Safety rule: Rectangular bogie cannot carry Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo + " to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Exception Caught: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed for " + shape + " bogie\n");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + (cargo != null ? cargo : "No Cargo");
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        // Program continues normally
        System.out.println("Final State:");
        System.out.println(b1);
        System.out.println(b2);
    }
}