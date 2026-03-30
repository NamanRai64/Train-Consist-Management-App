import java.util.HashMap;
import java.util.Map;

public class BogieCapacity {
    public static void run() {
        
        // ANSI color codes for rich aesthetics
        String AMBER  = "\u001B[33m";
        String GREEN  = "\u001B[32m";
        String TEAL   = "\u001B[36m";
        String MUTED  = "\u001B[90m";
        String RESET  = "\u001B[0m";

        // Display Header (Consistent with project style)
        System.out.println(AMBER + "  ███╗   ███╗ █████╗ ███╗  ██╗ █████╗  ██████╗ ███████╗██████╗");
        System.out.println(       "  ████╗ ████║██╔══██╗████╗ ██║██╔══██╗██╔════╝ ██╔════╝██╔══██╗");
        System.out.println(       "  ██╔████╔██║███████║██╔██╗██║███████║██║  ███╗█████╗  ██████╔╝");
        System.out.println(       "  ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║   ██║██╔══╝  ██╔══██╗");
        System.out.println(       "  ██║ ╚═╝ ██║██║  ██║██║ ╚███║██║  ██║╚██████╔╝███████╗██║  ██║");
        System.out.println(       "  ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚══╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝" + RESET);
        System.out.println();
        System.out.println(MUTED + "  [ UC-06 ]──[ Bogie Capacity Mapping ]──[ HashMap Operations ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a HashMap<String, Integer> for the bogie-capacity mapping.
        Map<String, Integer> capacities = new HashMap<>();

        // 2 & 3. Insert capacity values for bogies using put() method.
        System.out.println(TEAL + "  [ACTION] REGISTERING BOGIE CAPACITIES . . ." + RESET);
        capacities.put("Sleeper", 72);
        capacities.put("AC Chair", 40);
        capacities.put("First Class", 24);
        
        System.out.println(GREEN + "  MAP INITIALIZED WITH " + capacities.size() + " BOGIE TYPES." + RESET);
        System.out.println();

        // 4 & 5. Iterate over the map using entrySet() and display details.
        System.out.println(AMBER + "  BOGIE CAPACITY DETAILS :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.printf(TEAL + "  %-15s | %s\n" + RESET, "Bogie Type", "Capacity (Seats)");
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        
        for (Map.Entry<String, Integer> entry : capacities.entrySet()) {
            System.out.printf(GREEN + "  %-15s : %-10d seats\n" + RESET, entry.getKey(), entry.getValue());
        }
        
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        // 6. Fast Lookup Demonstration
        String searchKey = "Sleeper";
        System.out.println(TEAL + "  [ACTION] PERFORMING FAST LOOKUP FOR: '" + searchKey + "' . . ." + RESET);
        Integer capacity = capacities.get(searchKey);
        System.out.println(TEAL + "  RESULT : " + searchKey + " capacity is " + capacity + " seats." + RESET);

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: HashMap successfully mapped bogies to their seating capacities." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Key-Value association for real-world attribute modeling." + RESET);
    }
}
