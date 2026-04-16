import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatValidation {
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
        System.out.println(MUTED + "  [ UC-11 ]──[ Format Validation ]──[ Regular Expressions ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1, 2 & 3. Define and Compile Regex Patterns.
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";
        
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        System.out.println(TEAL + "  [ACTION] VALIDATING SYSTEM IDENTIFIERS . . ." + RESET);
        System.out.println();

        // 4 & 5. Validate Train IDs.
        validate("Train ID", "TRN-1234", trainIdPattern);
        validate("Train ID", "TRAIN12", trainIdPattern);
        validate("Train ID", "TRN-123", trainIdPattern);

        System.out.println();

        // Validate Cargo Codes.
        validate("Cargo Code", "PET-AB", cargoCodePattern);
        validate("Cargo Code", "PET-ab", cargoCodePattern);
        validate("Cargo Code", "PET-12", cargoCodePattern);

        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Regular Expressions enforced strict format compliance." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Data integrity validation using Pattern and Matcher." + RESET);
    }

    private static void validate(String label, String input, Pattern pattern) {
        String GREEN  = "\u001B[32m";
        String RED    = "\u001B[31m";
        String MUTED  = "\u001B[90m";
        String RESET  = "\u001B[0m";

        Matcher matcher = pattern.matcher(input);
        boolean isValid = matcher.matches();

        System.out.printf(MUTED + "  %-10s : %-10s -> " + RESET, label, input);
        if (isValid) {
            System.out.println(GREEN + "[ VALID ]" + RESET);
        } else {
            System.out.println(RED + "[ INVALID ]" + RESET);
        }
    }
}
