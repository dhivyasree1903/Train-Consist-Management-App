import java.util.ArrayList;
import java.util.List;

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
    bogies.add(new Bogie("General", "Passenger", 90));

    // Display Bogies
    System.out.println("\nPassenger Bogies:");
    bogies.forEach(System.out::println);

    // Calculate Total Seats using reduce
    int totalSeats =
            bogies.stream()
                    .map(b -> b.capacity)
                    .reduce(0, Integer::sum);

    // Display Total Seats
    System.out.println("\nTotal Seating Capacity: " + totalSeats);

    System.out.println("\nProgram continues...");
}
}





