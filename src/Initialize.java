import java.util.ArrayList;
import java.util.List;

public class Initialize {
        public static void main(String[] args) {
            printAsciiArt();

            System.out.println("\n  [ EXECUTING UC-02 ] . . .");
            PassengerBogies.run();

            System.out.println("\n  [ EXECUTING UC-03 ] . . .");
            UniqueBogieIDs.run();

            System.out.println("\n  [ EXECUTING UC-04 ] . . .");
            OrderedBogieIDs.run();

            System.out.println("\n  [ EXECUTING UC-05 ] . . .");
            PreservedInsertionOrder.run();

            System.out.println("\n  [ EXECUTING UC-06 ] . . .");
            BogieCapacity.run();

            System.out.println("\n  SYSTEM EXECUTION COMPLETE.");
        }

        public static void printAsciiArt() {

            // ANSI color codes
            String AMBER  = "\u001B[33m";
            String GREEN  = "\u001B[32m";
            String TEAL   = "\u001B[36m";
            String MUTED  = "\u001B[90m";
            String RESET  = "\u001B[0m";

            // Title - TRAIN
            System.out.println(AMBER + "  ████████╗ ██████╗  █████╗ ██╗███╗  ██╗");
            System.out.println(       "     ██╔══╝ ██╔══██╗██╔══██╗██║████╗ ██║");
            System.out.println(       "     ██║    ██████╔╝███████║██║██╔██╗██║");
            System.out.println(       "     ██║    ██╔══██╗██╔══██║██║██║╚████║");
            System.out.println(       "     ██║    ██║  ██║██║  ██║██║██║ ╚███║");
            System.out.println(       "     ╚═╝    ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚══╝" + RESET);
            System.out.println();

            // Title - CONSIST
            System.out.println(GREEN + "   ██████╗ ██████╗ ███╗  ██╗███████╗██╗███████╗████████╗");
            System.out.println(       "  ██╔════╝██╔═══██╗████╗ ██║██╔════╝██║██╔════╝╚══██╔══╝");
            System.out.println(       "  ██║     ██║   ██║██╔██╗██║███████╗██║███████╗   ██║   ");
            System.out.println(       "  ██║     ██║   ██║██║╚████║╚════██║██║╚════██║   ██║   ");
            System.out.println(       "  ╚██████╗╚██████╔╝██║ ╚███║███████║██║███████║   ██║   ");
            System.out.println(       "   ╚═════╝ ╚═════╝ ╚═╝  ╚══╝╚══════╝╚═╝╚══════╝   ╚═╝  " + RESET);
            System.out.println();

            // Title - MANAGER
            System.out.println(TEAL + "      ███╗   ███╗ █████╗ ███╗  ██╗ █████╗  ██████╗ ███████╗██████╗");
            System.out.println(       "      ████╗ ████║██╔══██╗████╗ ██║██╔══██╗██╔════╝ ██╔════╝██╔══██╗");
            System.out.println(       "      ██╔████╔██║███████║██╔██╗██║███████║██║  ███╗█████╗  ██████╔╝");
            System.out.println(       "      ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║   ██║██╔══╝  ██╔══██╗");
            System.out.println(       "      ██║ ╚═╝ ██║██║  ██║██║ ╚███║██║  ██║╚██████╔╝███████╗██║  ██║");
            System.out.println(       "      ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚══╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝" + RESET);
            System.out.println();

            // Tag line
            System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────");
            System.out.println(       "  [ Core Java ]──[ Data Structures ]──[ OOP Design ]──[ Console-based ]");
            System.out.println(       "  ─────────────────────────────────────────────────────────────────────" + RESET);
            System.out.println();

            List<String> trainConsist = new ArrayList<>();

            System.out.println(AMBER+ "  ─────────────────────────────────────────────────────────────────────");
            System.out.println(AMBER+ "  TRAIN INITIALIZE SUCCESSFULLY . . . " );
            System.out.println(GREEN+ "  INITIAL BOGIE COUNT : " + trainConsist.size());
            System.out.println(TEAL + "  CURRENT TRAIN CONSIST : " + trainConsist );
            System.out.println(       "  ─────────────────────────────────────────────────────────────────────" + RESET);
            System.out.println();

            System.out.println(       "   App-based learning  //  Core Java  //  Data Structures  //  v1.0" + RESET);
        }
    }
