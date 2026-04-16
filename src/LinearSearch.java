public class LinearSearch {
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
        System.out.println(MUTED + "  [ UC-18 ]──[ Linear Search ]──[ Sequential Traversal ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User provides a list of bogie IDs.
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        
        // 2. User provides a search key.
        String searchKey = "BG309";
        
        System.out.println(MUTED + "  DATASET : { BG101, BG205, BG309, BG412, BG550 }" + RESET);
        System.out.println(TEAL + "  [ACTION] SEARCHING FOR ID : '" + searchKey + "' . . ." + RESET);
        System.out.println();

        // 3, 4 & 5. Traverse array and compare.
        boolean found = false;
        for (int i = 0; i < bogieIds.length; i++) {
            System.out.println(MUTED + "  Checking index " + i + ": " + bogieIds[i] + " . . ." + RESET);
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println(GREEN + "  [ MATCH FOUND ] : Identifier matched at index " + i + RESET);
                break; // 5. If match found, search stops.
            }
        }

        // 6. Result is displayed.
        System.out.println();
        System.out.println(AMBER + "  SEARCH RESULT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        if (found) {
            System.out.println(GREEN + "  STATUS : Bogie ID '" + searchKey + "' exists in the consist." + RESET);
        } else {
            System.out.println(RED + "  STATUS : Bogie ID '" + searchKey + "' NOT found." + RESET);
        }
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Linear search correctly pinpointed ID using O(n) traversal." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Sequential comparison logic for unsorted data sets." + RESET);
    }
}
