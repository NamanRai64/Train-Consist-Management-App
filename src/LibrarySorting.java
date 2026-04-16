import java.util.Arrays;

public class LibrarySorting {
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
        System.out.println(MUTED + "  [ UC-17 ]──[ Efficient Library Sorting ]──[ Arrays.sort() ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User provides bogie type names.
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        
        System.out.println(TEAL + "  [ACTION] INITIALIZING BOGIE TYPES ARRAY (Unsorted) . . ." + RESET);
        System.out.println(MUTED + "  Current Array: " + Arrays.toString(bogieTypes) + RESET);
        System.out.println();

        // 2 & 3. System calls Arrays.sort() and Java internally sorts the values.
        System.out.println(TEAL + "  [ACTION] EXECUTING OPTIMIZED LIBRARY SORT . . ." + RESET);
        Arrays.sort(bogieTypes);

        // 4. Sorted bogie names are displayed.
        System.out.println(AMBER + "  SORTED BOGIE TYPES (Alphabetical) :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "  " + Arrays.toString(bogieTypes) + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Optimized O(n log n) sorting achieved using standard library." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Leveraging production-ready utilities over manual algorithms." + RESET);
    }
}
