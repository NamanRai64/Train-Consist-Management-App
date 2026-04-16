import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredBogies {
    public static void run() throws InvalidCapacityException {
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
        System.out.println(MUTED + "  [ UC-08 ]──[ Bogie Capacity Filtering ]──[ Java Stream API ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User creates a list of bogies (Re-populating for demonstration).
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println(TEAL + "  [ORIGINAL DATA] ALL REGISTERED BOGIES :" + RESET);
        System.out.println(MUTED + "  " + bogies + RESET);
        System.out.println();

        // 2 & 3. The system converts the list into a stream and applies filter().
        int capacityThreshold = 60;
        System.out.println(TEAL + "  [ACTION] FILTERING BOGIES WITH CAPACITY > " + capacityThreshold + " . . ." + RESET);
        
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.getCapacity() > capacityThreshold)
                .collect(Collectors.toList());

        // 4 & 5. Filtered bogies are collected and displayed.
        System.out.println(AMBER + "  FILTERED BOGIE LIST (High Capacity Only) :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.printf(TEAL + "  %-15s | %s\n" + RESET, "Bogie Name", "Capacity");
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        
        if (highCapacityBogies.isEmpty()) {
            System.out.println(AMBER + "  [!] No bogies match the criteria." + RESET);
        } else {
            for (Bogie b : highCapacityBogies) {
                System.out.printf(GREEN + "  %-15s : %-10d seats\n" + RESET, b.getName(), b.getCapacity());
            }
        }
        
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        // Demonstrate Integrity
        System.out.println(TEAL + "  [CHECK] ORIGINAL LIST INTEGRITY CHECK: " + RESET);
        System.out.println(MUTED + "  Size of original list: " + bogies.size() + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Stream API filtered bogies without modifying original list." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Declarative programming and functional-style filtering." + RESET);
    }
}
