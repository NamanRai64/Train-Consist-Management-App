import java.util.ArrayList;
import java.util.List;

public class PassengerBogies {
    public static void main(String[] args) {
        
        // ANSI color codes for rich aesthetics
        String AMBER  = "\u001B[33m";
        String GREEN  = "\u001B[32m";
        String TEAL   = "\u001B[36m";
        String MUTED  = "\u001B[90m";
        String RESET  = "\u001B[0m";

        // Header section for UC-02
        System.out.println(AMBER + "  UC-02 : PASSENGER BOGIE MANAGEMENT" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  GOAL : DYNAMIC INSERTION AND REMOVAL USING ArrayList" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Create an ArrayList<String> for passenger bogies.
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class.
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion.
        System.out.println(GREEN + "  [ACTION] ADDING PASSENGER BOGIES . . ." + RESET);
        System.out.println(GREEN + "  CURRENT BOGIES : " + passengerBogies + RESET);
        System.out.println(GREEN + "  TOTAL COUNT    : " + passengerBogies.size() + RESET);
        System.out.println();

        // 4. Remove one bogie (for example AC Chair).
        System.out.println(AMBER + "  [ACTION] REMOVING BOGIE : AC Chair . . ." + RESET);
        passengerBogies.remove("AC Chair");
        System.out.println(AMBER + "  UPDATED BOGIES : " + passengerBogies + RESET);
        System.out.println();

        // 5. Use contains() to check if Sleeper exists.
        System.out.println(TEAL + "  [ACTION] CHECKING EXISTENCE OF 'Sleeper' . . ." + RESET);
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println(TEAL + "  RESULT : " + (exists ? "Bogie 'Sleeper' is present in the consist." : "Bogie 'Sleeper' not found.") + RESET);
        System.out.println();

        // 6. Print final list state.
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(GREEN + "  FINAL TRAIN CONSIST : " + passengerBogies + RESET);
        System.out.println(GREEN + "  FINAL BOGIE COUNT   : " + passengerBogies.size() + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: CRUD Operations on ArrayList complete." + RESET);
    }
}
