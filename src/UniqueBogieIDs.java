import java.util.HashSet;
import java.util.Set;

public class UniqueBogieIDs {
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
        System.out.println(MUTED + "  [ UC-03 ]──[ Unique Bogie Identification ]──[ HashSet Operations ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a HashSet<String> for bogie IDs.
        Set<String> bogieIDs = new HashSet<>();

        // 2. Add values, including duplicates intentionally.
        System.out.println(TEAL + "  [ACTION] ATTEMPTING TO REGISTER BOGIE IDs . . ." + RESET);
        System.out.println(MUTED + "  -> Registering: BG101" + RESET);
        bogieIDs.add("BG101");
        
        System.out.println(MUTED + "  -> Registering: BG102" + RESET);
        bogieIDs.add("BG102");
        
        System.out.println(AMBER + "  -> Registering Duplicate: BG101 (Alert! Should be ignored)" + RESET);
        bogieIDs.add("BG101"); // This duplicate will be ignored by HashSet

        System.out.println(MUTED + "  -> Registering: BG103" + RESET);
        bogieIDs.add("BG103");
        
        System.out.println();

        // 3. Observe that duplicates are removed automatically.
        System.out.println(GREEN + "  [STATUS] REGISTRATION COMPLETE." + RESET);
        System.out.println(GREEN + "  UNIQUE BOGIE IDs IN SYSTEM : " + bogieIDs + RESET);
        System.out.println(GREEN + "  TOTAL UNIQUE COUNT : " + bogieIDs.size() + RESET);
        System.out.println();

        // 4. Print the final set.
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: HashSet ensured '" + bogieIDs.size() + "' unique registrations only." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Data integrity enforced via Set uniqueness." + RESET);
    }
}
