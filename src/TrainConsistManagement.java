import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagement {

    // Regex patterns
    private static final String TRAIN_ID_PATTERN = "TRN-\\d{4}";
    private static final String CARGO_CODE_PATTERN = "[A-Z]{3}-\\d{3}";

    // Validate Train ID
    public static boolean validateTrainId(String trainId) {
        Pattern pattern = Pattern.compile(TRAIN_ID_PATTERN);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Validate Cargo Code
    public static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile(CARGO_CODE_PATTERN);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        // Sample inputs
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";

        String cargoCode1 = "CMT-456";
        String cargoCode2 = "cm-45A";

        // Train ID validation
        System.out.println("Train ID Validation:");
        System.out.println(trainId1 + " -> " + validateTrainId(trainId1));
        System.out.println(trainId2 + " -> " + validateTrainId(trainId2));

        // Cargo Code validation
        System.out.println("\nCargo Code Validation:");
        System.out.println(cargoCode1 + " -> " + validateCargoCode(cargoCode1));
        System.out.println(cargoCode2 + " -> " + validateCargoCode(cargoCode2));
    }
}