import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.Set;
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
    }

    System.out.println("\nFinal Passenger Bogies:");
    System.out.println(passengerBogies);


    // UC4 - LinkedList
    System.out.println("\n=== Maintain Ordered Train Consist ===");

    LinkedList<String> trainConsist = new LinkedList<>();

    trainConsist.add("Engine");
    trainConsist.add("Sleeper");
    trainConsist.add("AC");
    trainConsist.add("Cargo");
    trainConsist.add("Guard");

    System.out.println("\nInitial Train Consist:");
    System.out.println(trainConsist);

    trainConsist.add(2, "Pantry Car");

    System.out.println("\nAfter Adding Pantry Car:");
    System.out.println(trainConsist);

    trainConsist.removeFirst();
    trainConsist.removeLast();

    System.out.println("\nFinal Ordered Train Consist:");
    System.out.println(trainConsist);


    // UC5 - LinkedHashSet
    System.out.println("\n=== Preserve Insertion Order of Bogies ===");

    Set<String> formation = new LinkedHashSet<>();

    // Add bogies
    formation.add("Engine");
    formation.add("Sleeper");
    formation.add("Cargo");
    formation.add("Guard");

    // Add duplicate
    formation.add("Sleeper");

    System.out.println("\nFinal Train Formation:");
    System.out.println(formation);

    System.out.println("\nProgram continues...");
}
}



