import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmntTest {

    @Test
    void testException_ValidCapacityCreation() {
        assertDoesNotThrow(() -> {
            Bogie b = new Bogie("Sleeper", 72);
            assertEquals(72, b.getCapacity());
        });
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        InvalidCapacityException exception = assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Sleeper", -10);
        });
        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new Bogie("Sleeper", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        try {
            new Bogie("Sleeper", 0);
        } catch (InvalidCapacityException e) {
            assertEquals("Capacity must be greater than zero", e.getMessage());
        }
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        Bogie b = new Bogie("General", 90);
        assertEquals("General", b.getName());
        assertEquals(90, b.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() {
        assertDoesNotThrow(() -> {
            new Bogie("Sleeper", 72);
            new Bogie("AC Chair", 56);
            new Bogie("First Class", 24);
        });
    }
}
