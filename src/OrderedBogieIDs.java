import java.util.LinkedList;

public class OrderedBogieIDs {
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
        System.out.println(MUTED + "  [ UC-04 ]──[ Physical Train Chaining ]──[ LinkedList Operations ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create a LinkedList<String> for the consist.
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard.
        System.out.println(TEAL + "  [ACTION] FORMING INITIAL TRAIN STRUCTURE . . ." + RESET);
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        
        System.out.println(GREEN + "  INITIAL CONSIST : " + String.join(" ↔ ", trainConsist) + RESET);
        System.out.println();

        // 3. Insert a Pantry Car at position 2.
        System.out.println(AMBER + "  [ACTION] ATTACHING 'Pantry Car' AT POSITION 2 . . ." + RESET);
        trainConsist.add(2, "Pantry Car");
        System.out.println(AMBER + "  UPDATED CONSIST : " + String.join(" ↔ ", trainConsist) + RESET);
        System.out.println();

        // 4. Remove the first and last bogie.
        System.out.println(TEAL + "  [ACTION] DETACHING HEAD (Engine) AND TAIL (Guard) . . ." + RESET);
        String detachedHead = trainConsist.removeFirst();
        String detachedTail = trainConsist.removeLast();
        
        System.out.println(MUTED + "  -> Detached Head : " + detachedHead + RESET);
        System.out.println(MUTED + "  -> Detached Tail : " + detachedTail + RESET);
        System.out.println();

        // 5. Display the final ordered train consist.
        System.out.println(GREEN + "  FINAL ORDERED TRAIN CONSIST : " + String.join(" ↔ ", trainConsist) + RESET);
        System.out.println(GREEN + "  FINAL BOGIE COUNT : " + trainConsist.size() + RESET);
        
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: LinkedList maintained physical sequence and allowed efficient middle insertion." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Node-based chaining for physical ordering complete." + RESET);
    }
}
