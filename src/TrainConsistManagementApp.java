import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Train Consist Management App ===");

    // UC2 - Passenger Bogies
    List<String> passengerBogies = new ArrayList<>();

    passengerBogies.add("Sleeper");
    passengerBogies.add("AC Chair");
    passengerBogies.add("First Class");

    System.out.println("\nPassenger Bogies After Adding:");
    System.out.println(passengerBogies);

    passengerBogies.remove("AC Chair");

    System.out.println("\nAfter Removing AC Chair:");
    System.out.println(passengerBogies);

    if (passengerBogies.contains("Sleeper")) {
        System.out.println("\nSleeper bogie exists in train");
    } else {
        System.out.println("\nSleeper bogie not found");
    }

    System.out.println("\nFinal Passenger Bogies:");
    System.out.println(passengerBogies);


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

    // Remove first and last bogie
    trainConsist.removeFirst();
    trainConsist.removeLast();

    System.out.println("\nFinal Ordered Train Consist:");
    System.out.println(trainConsist);

    System.out.println("\nProgram continues...");
}
}



