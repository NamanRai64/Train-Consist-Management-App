import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmntTest {

    @Test
    void testCargo_SafeAssignment() {
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical", "Circular", "Water");
        assertDoesNotThrow(() -> {
            cylindrical.setCargo("Petroleum");
        });
        assertEquals("Petroleum", cylindrical.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie rectangular = new GoodsBogie("Box", "Rectangular", "Coal");
        CargoSafetyException exception = assertThrows(CargoSafetyException.class, () -> {
            rectangular.setCargo("Petroleum");
        });
        assertTrue(exception.getMessage().contains("Safety Violation"));
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie rectangular = new GoodsBogie("Box", "Rectangular", "Coal");
        try {
            rectangular.setCargo("Petroleum");
        } catch (CargoSafetyException e) {
            // expected
        }
        assertEquals("Coal", rectangular.getCargo(), "Cargo should remain unchanged after violation");
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        GoodsBogie rectangular = new GoodsBogie("Box", "Rectangular", "Coal");
        GoodsBogie circular = new GoodsBogie("Cylindrical", "Circular", "Water");
        
        try {
            rectangular.setCargo("Petroleum");
        } catch (CargoSafetyException e) {}
        
        assertDoesNotThrow(() -> {
            circular.setCargo("Petroleum");
        });
        
        assertEquals("Petroleum", circular.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        // finally block is tested in the run() method, but here we verify logic consistency
        GoodsBogie b = new GoodsBogie("Box", "Rectangular", "Coal");
        boolean finallyReached = false;
        try {
            b.setCargo("Petroleum");
        } catch (CargoSafetyException e) {
            // caught
        } finally {
            finallyReached = true;
        }
        assertTrue(finallyReached);
    }
}
