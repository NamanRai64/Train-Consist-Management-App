import java.util.Arrays;

public class SmartSearch {
    public static void run() {
        // ANSI color codes for rich aesthetics
        String AMBER  = "\u001B[33m";
        String GREEN  = "\u001B[32m";
        String TEAL   = "\u001B[36m";
        String RED    = "\u001B[31m";
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
        System.out.println(MUTED + "  [ UC-19 ]──[ Optimized Smart Search ]──[ Binary Search O(log n) ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User provides bogie IDs (may be unsorted, but precondition is sorted).
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG205";
        
        System.out.println(MUTED + "  RAW DATASET : " + Arrays.toString(bogieIds) + RESET);
        
        // Ensure bogie IDs are sorted before searching.
        System.out.println(TEAL + "  [PRECONDITION] SORTING DATASET FOR BINARY SEARCH . . ." + RESET);
        Arrays.sort(bogieIds);
        System.out.println(GREEN + "  SORTED DATASET : " + Arrays.toString(bogieIds) + RESET);
        System.out.println();

        System.out.println(TEAL + "  [ACTION] SEARCHING FOR ID : '" + searchKey + "' . . ." + RESET);

        // 3-6. Binary Search Implementation.
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println(MUTED + "  Range: [" + low + " - " + high + "], Testing Mid Index " + mid + ": " + bogieIds[mid] + RESET);
            
            int comparison = searchKey.compareTo(bogieIds[mid]);
            if (comparison == 0) {
                found = true;
                foundIndex = mid;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }

        // 7. Result is displayed.
        System.out.println();
        System.out.println(AMBER + "  BINARY SEARCH RESULT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        if (found) {
            System.out.println(GREEN + "  [ SUCCESS ] : Bogie ID '" + searchKey + "' found at index " + foundIndex + RESET);
        } else {
            System.out.println(RED + "  [ FAILED ] : Bogie ID '" + searchKey + "' not found." + RESET);
        }
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Efficient log n lookup completed using divide-and-conquer." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Importance of preconditions for optimized algorithms." + RESET);
    }
}
