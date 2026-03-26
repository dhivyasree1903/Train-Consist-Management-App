class InvalidCapacityException extends Exception {

    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {

    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity + " seats";
    }
}
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Passenger Bogie Validation ===");

    try {

        PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
        PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // Invalid
        PassengerBogie b3 = new PassengerBogie("First Class", 24);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    } catch (InvalidCapacityException e) {
        System.out.println("Error: " + e.getMessage());
    }

    System.out.println("\nProgram continues...");

}
}





