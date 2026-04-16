import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmntTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(128, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("AC Chair", 56));
        
        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(218, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        
        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        
        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        Bogie bogie = new Bogie("Sleeper", 72);
        List<Bogie> bogies = List.of(bogie);
        
        int extraction = bogies.stream()
                .map(Bogie::getCapacity)
                .findFirst()
                .orElse(0);
                
        assertEquals(72, extraction);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 10));
        bogies.add(new Bogie("Sleeper", 20));
        bogies.add(new Bogie("Sleeper", 30));
        
        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(60, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        
        int originalSize = bogies.size();
        
        bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
                
        assertEquals(originalSize, bogies.size());
    }
}
