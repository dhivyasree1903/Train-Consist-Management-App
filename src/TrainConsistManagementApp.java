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


        // UC3 - Unique Bogie IDs
        System.out.println("\n=== Track Unique Bogie IDs ===");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);


        // UC4 - Maintain Ordered Train Consist
        System.out.println("\n=== Maintain Ordered Train Consist ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println(trainConsist);

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }


}
