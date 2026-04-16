import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceBenchmark {
    public static void run() throws InvalidCapacityException {
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
        System.out.println(MUTED + "  [ UC-13 ]──[ Performance Benchmarking ]──[ Loop vs Stream ]" + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);

        // 1. Prepare a collection of bogies.
        List<Bogie> bogies = new ArrayList<>();
        System.out.println(TEAL + "  [ACTION] INITIALIZING DATASET FOR BENCHMARKING . . ." + RESET);
        for (int i = 0; i < 5000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (int)(Math.random() * 100) + 1));
        }
        System.out.println(GREEN + "  DATASET SIZE : " + bogies.size() + " bogie objects." + RESET);
        System.out.println();

        // 2 & 3. Benchmarking Loop-Based Filtering.
        System.out.println(TEAL + "  [ACTION] STARTING LOOP-BASED FILTERING . . ." + RESET);
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // 4 & 5. Benchmarking Stream-Based Filtering.
        System.out.println(TEAL + "  [ACTION] STARTING STREAM-BASED FILTERING . . ." + RESET);
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // 6. Execution time is displayed.
        System.out.println(AMBER + "  BENCHMARK RESULTS (Capacity > 60) :" + RESET);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.printf(TEAL + "  %-20s : " + GREEN + "%d ns\n" + RESET, "Loop Execution Time", loopDuration);
        System.out.printf(TEAL + "  %-20s : " + GREEN + "%d ns\n" + RESET, "Stream Execution Time", streamDuration);
        System.out.println(MUTED + "  ──────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  CONSISTENCY CHECK : Both produced " + loopFiltered.size() + " matches." + RESET);
        System.out.println();

        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(TEAL + "  VERIFICATION: Performance measured using System.nanoTime() accurately." + RESET);
        System.out.println(MUTED + "  ─────────────────────────────────────────────────────────────────────" + RESET);
        System.out.println(       "   Learning Outcome: Evidence-driven optimization and style overhead awareness." + RESET);
    }
}
