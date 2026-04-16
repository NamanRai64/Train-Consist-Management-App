import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmntTest {

    @Test
    void testLoopFilteringLogic() throws InvalidCapacityException {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        
        assertEquals(1, loopFiltered.size());
        assertEquals(72, loopFiltered.get(0).getCapacity());
    }

    @Test
    void testStreamFilteringLogic() throws InvalidCapacityException {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
                
        assertEquals(1, streamFiltered.size());
        assertEquals(72, streamFiltered.get(0).getCapacity());
    }

    @Test
    void testLoopAndStreamResultsMatch() throws InvalidCapacityException {
        List<Bogie> bogies = new ArrayList<>();
        for(int i=0; i<10; i++) {
            bogies.add(new Bogie("B-" + i, (int)(Math.random() * 100) + 1));
        }
        
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 50) loopResult.add(b);
        }
        
        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 50)
                .collect(Collectors.toList());
                
        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        // small operation
        int sum = 0;
        for(int i=0; i<100; i++) sum += i;
        long end = System.nanoTime();
        
        assertTrue((end - start) >= 0);
    }

    @Test
    void testLargeDatasetProcessing() throws InvalidCapacityException {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("B", 70));
        }
        
        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
                
        assertEquals(1000, result.size());
    }
}
