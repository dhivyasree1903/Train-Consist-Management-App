import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Train Consist Management App ===");

    // Sample Inputs
    String trainId = "TRN-1234";
    String cargoCode = "PET-AB";

    // Regex Patterns
    String trainPattern = "TRN-\\d{4}";
    String cargoPattern = "PET-[A-Z]{2}";

    // Compile Patterns
    Pattern trainRegex = Pattern.compile(trainPattern);
    Pattern cargoRegex = Pattern.compile(cargoPattern);

    // Create Matchers
    Matcher trainMatcher = trainRegex.matcher(trainId);
    Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

    // Validate Train ID
    if (trainMatcher.matches()) {
        System.out.println("Valid Train ID: " + trainId);
    } else {
        System.out.println("Invalid Train ID: " + trainId);
    }

    // Validate Cargo Code
    if (cargoMatcher.matches()) {
        System.out.println("Valid Cargo Code: " + cargoCode);
    } else {
        System.out.println("Invalid Cargo Code: " + cargoCode);
    }

    System.out.println("\nProgram continues...");
}
}





