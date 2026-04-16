import java.util.ArrayList;
import java.util.List;

public class TotalCapacity {
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
        System.out.println(MUTED + "  [ UC-10 ]──[ Seat Capacity Aggregation ]──[ stream.reduce() ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a list of bogies.
        List<Bogie> bogies = new ArrayList<>();
        System.out.println(TEAL + "  [ACTION] LOADING BOGIE CAPACITY DATA . . ." + RESET);
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println(GREEN + "  LIST LOADED WITH " + bogies.size() + " BOGIE ENTRIES." + RESET);
        System.out.println();

        // 2, 3 & 4. Convert list to stream, map capacities, and reduce to sum.
        System.out.println(TEAL + "  [ACTION] CALCULATING TOTAL TRAIN CAPACITY . . ." + RESET);
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // 5. Total seating capacity is displayed.
        System.out.println(AMBER + "  ANALYTICS RESULT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "  TOTAL SEATING CAPACITY : " + totalSeats + " seats" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Aggregation logic successfully computed train-wide metrics." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Functional aggregation replacing imperative loops." + RESET);
    }
}
