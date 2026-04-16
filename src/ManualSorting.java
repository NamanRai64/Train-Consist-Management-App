public class ManualSorting {
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
        System.out.println(MUTED + "  [ UC-16 ]──[ Manual Sorting ]──[ Bubble Sort Algorithm ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. User provides passenger bogie capacities.
        int[] capacities = {72, 56, 24, 90, 60, 42};
        
        System.out.println(TEAL + "  [ACTION] INITIALIZING CAPACITIES ARRAY (Unsorted) . . ." + RESET);
        printArray(capacities);
        System.out.println();

        // 2-5. Bubble Sort Algorithm.
        System.out.println(TEAL + "  [ACTION] EXECUTING BUBBLE SORT PASSES . . ." + RESET);
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Adjacent values are compared.
                if (capacities[j] > capacities[j + 1]) {
                    // If out of order, values are swapped.
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // 6. Sorted result is displayed.
        System.out.println(AMBER + "  SORTED CAPACITIES RESULT :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        printArray(capacities);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Algorithm successfully reordered values in O(n²) time." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Internal logic of sorting without library methods." + RESET);
    }

    private static void printArray(int[] arr) {
        String MUTED  = "\u001B[90m";
        String RESET  = "\u001B[0m";
        String GREEN  = "\u001B[32m";
        
        System.out.print(MUTED + "  [ " + RESET);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(GREEN + arr[i] + RESET + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(MUTED + " ]" + RESET);
    }
}
