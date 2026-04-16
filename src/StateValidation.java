public class StateValidation {
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
        System.out.println(MUTED + "  [ UC-20 ]──[ Defensive State Validation ]──[ Fail-Fast Behavior ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // Scenario: Empty collection.
        String[] emptyBogieList = {};
        String searchKey = "BG101";

        System.out.println(TEAL + "  [ACTION] ATTEMPTING SEARCH ON EMPTY BOGIE LIST . . ." + RESET);
        System.out.println();

        try {
            // Check whether the bogie collection is empty.
            if (emptyBogieList.length == 0) {
                // Throw IllegalStateException if no bogies exist.
                throw new IllegalStateException("Search Failed: No bogies found in the train consist!");
            }
            
            // This part won't execute if empty.
            System.out.println(GREEN + "  [ SUCCESS ] : Starting search for " + searchKey + RESET);
            
        } catch (IllegalStateException e) {
            // User receives a meaningful error message.
            System.out.println(RED + "  [ FAIL-FAST ERROR ] : " + e.getMessage() + RESET);
            System.out.println(MUTED + "  (State validation prevented meaningless computation.)" + RESET);
        }

        System.out.println();
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Application protected against invalid states using exceptions." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Defensive coding practices to ensure system reliability." + RESET);
    }
}
