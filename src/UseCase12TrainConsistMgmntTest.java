import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmntTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Box", "Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Circular", "Petroleum"));
        
        boolean isSafe = bogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );
        
        assertTrue(isSafe);
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Circular", "Coal"));
        
        boolean isSafe = bogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );
        
        assertFalse(isSafe);
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Open", "Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Box", "Rectangular", "Grain"));
        
        boolean isSafe = bogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );
        
        assertTrue(isSafe);
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Box", "Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Circular", "Chemicals"));
        
        boolean isSafe = bogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );
        
        assertFalse(isSafe);
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<GoodsBogie> bogies = new ArrayList<>();
        
        boolean isSafe = bogies.stream().allMatch(b -> 
            !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")
        );
        
        assertTrue(isSafe, "Empty list should be safe by default");
    }
}
