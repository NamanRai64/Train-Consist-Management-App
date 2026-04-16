import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedBogies {
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
        System.out.println(MUTED + "  [ UC-07 ]──[ Custom Bogie Sorting ]──[ Comparator Interface ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a List<Bogie> for passenger bogies.
        List<Bogie> bogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class with capacities.
        System.out.println(TEAL + "  [ACTION] CREATING BOGIE OBJECTS . . ." + RESET);
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println(GREEN + "  LIST CREATED WITH " + bogies.size() + " BOGIE OBJECTS." + RESET);
        System.out.println(MUTED + "  Unsorted List: " + bogies + RESET);
        System.out.println();

        // 3. System applies a Comparator to sort by capacity (Descending).
        System.out.println(TEAL + "  [ACTION] SORTING BOGIES BY CAPACITY (DESCENDING) . . ." + RESET);
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // 4. Sorted bogies are displayed in order.
        System.out.println(AMBER + "  SORTED BOGIE LIST (By Highest Capacity) :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.printf(TEAL + "  %-15s | %s\n" + RESET, "Bogie Name", "Capacity");
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        
        for (Bogie b : bogies) {
            System.out.printf(GREEN + "  %-15s : %-10d seats\n" + RESET, b.getName(), b.getCapacity());
        }
        
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Bogies are ranked and logically ordered for planning." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Custom sorting using Comparator and object-based collections." + RESET);
    }
}
