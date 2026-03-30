import java.util.LinkedHashSet;
import java.util.Set;

public class PreservedInsertionOrder {
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
        System.out.println(MUTED + "  [ UC-05 ]──[ Safe Insertion Order ]──[ LinkedHashSet Operations ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a LinkedHashSet<String> for the train formation.
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard.
        System.out.println(TEAL + "  [ACTION] ATTACHING BOGIES IN SEQUENCE . . ." + RESET);
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        
        System.out.println(GREEN + "  CURRENT FORMATION : " + String.join(" -> ", trainFormation) + RESET);
        System.out.println();

        // 3. Attempt to attach a duplicate bogie intentionally (example: Sleeper again).
        System.out.println(AMBER + "  [ACTION] ATTEMPTING DUPLICATE ATTACHMENT : 'Sleeper' . . ." + RESET);
        boolean added = trainFormation.add("Sleeper"); 
        
        if (!added) {
            System.out.println(AMBER + "  [ALERT]  Duplicate 'Sleeper' ignored by LinkedHashSet!" + RESET);
        }
        System.out.println();

        // 4. Display the final formation order.
        System.out.println(GREEN + "  FINAL TRAIN FORMATION (Order Preserved) : " + String.join(" -> ", trainFormation) + RESET);
        System.out.println(GREEN + "  FINAL BOGIE COUNT : " + trainFormation.size() + RESET);
        
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Combined uniqueness of HashSet with ordering of LinkedList." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Safe, ordered composition without manual loops." + RESET);
    }
}
