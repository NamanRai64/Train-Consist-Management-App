import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmntTest {

    private void validateNotEmpty(String[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalStateException("Search Failed: No bogies found in the train consist!");
        }
    }

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] emptyIds = {};
        assertThrows(IllegalStateException.class, () -> {
            validateNotEmpty(emptyIds);
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] ids = {"BG101", "BG205"};
        assertDoesNotThrow(() -> {
            validateNotEmpty(ids);
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] ids = {"BG101", "BG205", "BG309"};
        validateNotEmpty(ids);
        // Simple linear search as success case
        boolean found = false;
        for(String id : ids) if(id.equals("BG205")) found = true;
        assertTrue(found);
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] ids = {"BG101", "BG205", "BG309"};
        validateNotEmpty(ids);
        boolean found = false;
        for(String id : ids) if(id.equals("BG999")) found = true;
        assertFalse(found);
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] ids = {"BG101"};
        assertDoesNotThrow(() -> {
            validateNotEmpty(ids);
        });
    }
}
