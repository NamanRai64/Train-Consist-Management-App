import java.util.ArrayList;
import java.util.List;

public class SafetyCompliance {
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
        System.out.println(MUTED + "  [ UC-12 ]──[ Safety Compliance ]──[ stream.allMatch() ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Prepare a list of goods bogies.
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        System.out.println(TEAL + "  [ACTION] LOADING GOODS BOGIE DATA FOR SAFETY CHECK . . ." + RESET);
        goodsBogies.add(new GoodsBogie("Box", "Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Circular", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Rectangular", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Circular", "Petroleum"));

        System.out.println(GREEN + "  LIST LOADED WITH " + goodsBogies.size() + " GOODS BOGIES." + RESET);
        System.out.println(MUTED + "  Current Formation: " + goodsBogies + RESET);
        System.out.println();

        // 2, 3 & 4. Process stream and check safety rules using allMatch().
        System.out.println(TEAL + "  [ACTION] ENFORCING SAFETY RULES: Cylindrical -> Petroleum Only . . ." + RESET);
        
        boolean isSafe = goodsBogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );

        // 5. Result is displayed.
        System.out.println(AMBER + "  SAFETY COMPLIANCE RESULT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        if (isSafe) {
            System.out.println(GREEN + "  [ STATUS ] : TRAIN IS SAFETY COMPLIANT" + RESET);
            System.out.println(MUTED + "  Reason: All cylindrical bogies contain authorized cargo (Petroleum)." + RESET);
        } else {
            System.out.println(RED + "  [ STATUS ] : TRAIN IS UNSAFE / COMPLIANCE FAILED" + RESET);
            System.out.println(MUTED + "  Warning: Unauthorized cargo detected in cylindrical bogies!" + RESET);
        }
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Short-circuit stream validation verified train safety." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Business rule modeling using declarative stream predicates." + RESET);
    }
}
