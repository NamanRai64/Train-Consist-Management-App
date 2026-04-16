import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmntTest {

    private boolean linearSearch(String[] array, String key) {
        for (String element : array) {
            if (element.equals(key)) return true;
        }
        return false;
    }

    @Test
    void testSearch_BogieFound() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(linearSearch(ids, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(linearSearch(ids, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(linearSearch(ids, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(linearSearch(ids, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] ids = {"BG101"};
        assertTrue(linearSearch(ids, "BG101"));
        assertFalse(linearSearch(ids, "BG202"));
    }
}
