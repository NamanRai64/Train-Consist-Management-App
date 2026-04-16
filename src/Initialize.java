import java.util.ArrayList;
import java.util.List;

public class Initialize {
        public static void main(String[] args) throws InvalidCapacityException {
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

            System.out.println("\n  [ EXECUTING UC-07 ] . . .");
            SortedBogies.run();

            System.out.println("\n  [ EXECUTING UC-08 ] . . .");
            FilteredBogies.run();

            System.out.println("\n  [ EXECUTING UC-09 ] . . .");
            GroupedBogies.run();

            System.out.println("\n  [ EXECUTING UC-10 ] . . .");
            TotalCapacity.run();

            System.out.println("\n  [ EXECUTING UC-11 ] . . .");
            FormatValidation.run();

            System.out.println("\n  [ EXECUTING UC-12 ] . . .");
            SafetyCompliance.run();

            System.out.println("\n  [ EXECUTING UC-13 ] . . .");
            PerformanceBenchmark.run();

            System.out.println("\n  [ EXECUTING UC-14 ] . . .");
            CapacityValidation.run();

            System.out.println("\n  [ EXECUTING UC-15 ] . . .");
            SafeCargoAssignment.run();

            System.out.println("\n  [ EXECUTING UC-16 ] . . .");
            ManualSorting.run();

            System.out.println("\n  [ EXECUTING UC-17 ] . . .");
            LibrarySorting.run();

            System.out.println("\n  [ EXECUTING UC-18 ] . . .");
            LinearSearch.run();

            System.out.println("\n  [ EXECUTING UC-19 ] . . .");
            SmartSearch.run();

            System.out.println("\n  [ EXECUTING UC-20 ] . . .");
            StateValidation.run();

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
