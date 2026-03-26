import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }
}
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Sort Bogies by Capacity ===");

    // Create List
    List<Bogie> bogies = new ArrayList<>();

    // Add Bogies
    bogies.add(new Bogie("Sleeper", 72));
    bogies.add(new Bogie("AC Chair", 60));
    bogies.add(new Bogie("First Class", 24));

    System.out.println("\nBefore Sorting:");
    for (Bogie b : bogies) {
        System.out.println(b);
    }

    // Sort using Comparator
    bogies.sort(Comparator.comparingInt(b -> b.capacity));

    System.out.println("\nAfter Sorting by Capacity:");
    for (Bogie b : bogies) {
        System.out.println(b);
    }

    System.out.println("\nProgram continues...");
}
}





