import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity + " seats";
    }
}


public class TrainConsistManagementApp {  public static void main(String[] args) {  System.out.println("=== Train Consist Management App ===");

    // Create Bogie List
    List<Bogie> bogies = new ArrayList<>();

    // Add Bogies
    bogies.add(new Bogie("Sleeper", 72));
    bogies.add(new Bogie("AC Chair", 56));
    bogies.add(new Bogie("First Class", 24));
    bogies.add(new Bogie("General", 90));

    // Display All Bogies
    System.out.println("\nAll Passenger Bogies:");
    bogies.forEach(System.out::println);

    // Filter Bogies (Capacity > 60)
    List<Bogie> filteredBogies =
            bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());

    // Display Filtered Bogies
    System.out.println("\nFiltered Bogies (Capacity > 60):");
    filteredBogies.forEach(System.out::println);

    System.out.println("\nProgram continues...");
}
}





