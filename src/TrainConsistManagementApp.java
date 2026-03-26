import java.util.ArrayList;
import java.util.List;
class GoodsBogie {

    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " - " + cargo;
    }
}
public class TrainConsistManagementApp {  public static void main(String[] args) {
    System.out.println("=== Train Safety Compliance Check ===");

    // Create Goods Bogie List
    List<GoodsBogie> bogies = new ArrayList<>();

    bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
    bogies.add(new GoodsBogie("Box", "Coal"));
    bogies.add(new GoodsBogie("Open", "Grain"));
    bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

    // Display Bogies
    System.out.println("\nGoods Bogies:");
    bogies.forEach(System.out::println);

    // Safety Check using allMatch
    boolean isSafe =
            bogies.stream()
                    .allMatch(b ->
                            !b.type.equals("Cylindrical") ||
                                    b.cargo.equals("Petroleum")
                    );

    // Display Result
    if (isSafe) {
        System.out.println("\nTrain is SAFETY COMPLIANT");
    } else {
        System.out.println("\nTrain is NOT SAFE");
    }

    System.out.println("\nProgram continues...");

}
}





