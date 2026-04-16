public class SafeCargoAssignment {
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
        System.out.println(MUTED + "  [ UC-15 ]──[ Safe Cargo Assignment ]──[ try-catch-finally ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User attempts to assign cargo to a goods bogie.
        GoodsBogie rectangularBogie = new GoodsBogie("Box", "Rectangular", "Coal");
        System.out.println(MUTED + "  INITIAL BOGIE: " + rectangularBogie + RESET);
        System.out.println();

        System.out.println(TEAL + "  [ACTION] ATTEMPTING TO ASSIGN PETROLEUM TO RECTANGULAR BOGIE . . ." + RESET);
        
        try {
            // 2. System checks compatibility and may throw exception.
            rectangularBogie.setCargo("Petroleum");
            System.out.println(GREEN + "  [ SUCCESS ] : Cargo assigned successfully." + RESET);
        } catch (CargoSafetyException e) {
            // 3 & 4. Exception is caught and error message displayed.
            System.out.println(RED + "  [ SAFETY VIOLATION ] : " + e.getMessage() + RESET);
            System.out.println(MUTED + "  (Caught RuntimeException: CargoSafetyException)" + RESET);
        } finally {
            // 6. finally block executes cleanup or logging.
            System.out.println(MUTED + "  [ LOG ] : Cargo compatibility validation check completed." + RESET);
        }

        System.out.println();
        System.out.println(MUTED + "  CURRENT STATE: " + rectangularBogie + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Handled unsafe operational conditions without crashing." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Structured error handling using try-catch-finally." + RESET);
    }
}
