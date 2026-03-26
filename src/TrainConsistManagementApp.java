import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {  public static void main(String[] args) {

    System.out.println("=== Train Consist Management App ===");

    // Create Passenger Bogie List
    List<String> passengerBogies = new ArrayList<>();

    // Add Passenger Bogies
    passengerBogies.add("Sleeper");
    passengerBogies.add("AC Chair");
    passengerBogies.add("First Class");

    // Display After Adding
    System.out.println("\nPassenger Bogies After Adding:");
    System.out.println(passengerBogies);

    // Remove AC Chair
    passengerBogies.remove("AC Chair");

    System.out.println("\nAfter Removing AC Chair:");
    System.out.println(passengerBogies);

    // Check if Sleeper Exists
    if (passengerBogies.contains("Sleeper")) {
        System.out.println("\nSleeper bogie exists in train");
    } else {
        System.out.println("\nSleeper bogie not found");
    }

    // Final List
    System.out.println("\nFinal Passenger Bogies:");
    System.out.println(passengerBogies);

    System.out.println("\nProgram continues...");
}


}
