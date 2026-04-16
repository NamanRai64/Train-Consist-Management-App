import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupedBogies {
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
        System.out.println(MUTED + "  [ UC-09 ]──[ Bogie Categorization ]──[ collectors.groupingBy() ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a list of bogies with duplicate types for classification demonstration.
        List<Bogie> bogies = new ArrayList<>();
        System.out.println(TEAL + "  [ACTION] INITIALIZING BOGIE DATA WITH MULTIPLE TYPES . . ." + RESET);
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72)); // Second Sleeper bogie
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56)); // Second AC Chair bogie
        bogies.add(new Bogie("General", 90));

        System.out.println(GREEN + "  LIST CREATED WITH " + bogies.size() + " BOGIE OBJECTS." + RESET);
        System.out.println();

        // 2 & 3. Convert list to stream and apply groupingBy().
        System.out.println(TEAL + "  [ACTION] GROUPING BOGIES BY CATEGORY . . ." + RESET);
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // 4 & 5. Display the grouped results.
        System.out.println(AMBER + "  STRUCTURED BOGIE REPORT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        
        groupedBogies.forEach((category, list) -> {
            System.out.println(TEAL + "  CATEGORY: " + category.toUpperCase() + RESET);
            for (Bogie b : list) {
                System.out.println(GREEN + "    - " + b.getName() + " [" + b.getCapacity() + " seats]" + RESET);
            }
            System.out.println(MUTED + "    (Total in group: " + list.size() + ")" + RESET);
            System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        });

        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Flat list transformed into structured categorical Map." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Data aggregation and reporting using Stream Collectors." + RESET);
    }
}
