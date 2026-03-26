import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2 - Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing AC Chair:");
        System.out.println(passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists");
        }

        // UC3 - Unique Bogie IDs using HashSet
        System.out.println("\n=== Track Unique Bogie IDs ===");

        Set<String> bogieIDs = new HashSet<>();

        // Adding Bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101");  // Duplicate
        bogieIDs.add("BG102");  // Duplicate

        // Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("\nProgram continues...");
    }


}
