import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmntTest {

    private boolean binarySearch(String[] array, String key) {
        if (array == null || array.length == 0) return false;
        
        // Binary search requires sorted array
        String[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = key.compareTo(sortedArray[mid]);
            if (cmp == 0) return true;
            if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }

    @Test
    void testBinarySearch_BogieFound() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(binarySearch(ids, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(binarySearch(ids, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(binarySearch(ids, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(binarySearch(ids, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] ids = {"BG101"};
        assertTrue(binarySearch(ids, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] ids = {};
        assertFalse(binarySearch(ids, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] ids = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        assertTrue(binarySearch(ids, "BG205"));
    }
}
