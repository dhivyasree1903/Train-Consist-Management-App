import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
class Bogie {

    String name;
    String type;
    int capacity;

    Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + type + " - " + capacity + " seats";
    }
}
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Train Consist Management App ===");

    // Create Bogie List
    List<Bogie> bogies = new ArrayList<>();

    bogies.add(new Bogie("Sleeper", "Passenger", 72));
    bogies.add(new Bogie("AC Chair", "Passenger", 56));
    bogies.add(new Bogie("First Class", "Passenger", 24));
    bogies.add(new Bogie("Goods Wagon", "Goods", 100));
    bogies.add(new Bogie("Parcel Van", "Goods", 80));

    // Group Bogies by Type
    Map<String, List<Bogie>> groupedBogies =
            bogies.stream()
                    .collect(Collectors.groupingBy(b -> b.type));

    // Display Grouped Bogies
    System.out.println("\nGrouped Bogies:");

    groupedBogies.forEach((type, list) -> {
        System.out.println("\n" + type + " Bogies:");
        list.forEach(System.out::println);
    });

    System.out.println("\nProgram continues...");
}
}





