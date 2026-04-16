public class CapacityValidation {
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
        System.out.println(MUTED + "  [ UC-14 ]──[ Capacity Validation ]──[ Custom Checked Exception ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User attempts to create a passenger bogie.
        System.out.println(TEAL + "  [ACTION] ATTEMPTING TO CREATE BOGIE WITH VALID CAPACITY (72) . . ." + RESET);
        try {
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println(GREEN + "  [ SUCCESS ] : Created " + validBogie + RESET);
        } catch (InvalidCapacityException e) {
            System.out.println(RED + "  [ ERROR ] : " + e.getMessage() + RESET);
        }

        System.out.println();

        // 2 & 3. System validates and throws custom exception.
        System.out.println(TEAL + "  [ACTION] ATTEMPTING TO CREATE BOGIE WITH INVALID CAPACITY (0) . . ." + RESET);
        try {
            Bogie invalidBogie = new Bogie("First Class", 0);
            System.out.println(GREEN + "  [ SUCCESS ] : Created " + invalidBogie + RESET);
        } catch (InvalidCapacityException e) {
            System.out.println(RED + "  [ EXPECTED ERROR ] : " + e.getMessage() + RESET);
            System.out.println(MUTED + "  (InvalidCapacityException caught and handled safely.)" + RESET );
        }

        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Fail-fast validation prevents corrupted object creation." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Defensive programming and domain rule encapsulation." + RESET);
    }
}
