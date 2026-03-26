import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Train Consist Management App ===");


    // UC5 - LinkedHashSet
    System.out.println("\n=== Preserve Insertion Order of Bogies ===");

    Set<String> formation = new LinkedHashSet<>();

    formation.add("Engine");
    formation.add("Sleeper");
    formation.add("Cargo");
    formation.add("Guard");
    formation.add("Sleeper"); // duplicate

    System.out.println("Train Formation:");
    System.out.println(formation);


    // UC6 - HashMap
    System.out.println("\n=== Map Bogie to Capacity ===");

    Map<String, Integer> bogieCapacity = new HashMap<>();

    // Add Bogie Capacity
    bogieCapacity.put("Sleeper", 72);
    bogieCapacity.put("AC Chair", 60);
    bogieCapacity.put("First Class", 24);

    // Display Capacity
    for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    System.out.println("\nProgram continues...");



}
}



