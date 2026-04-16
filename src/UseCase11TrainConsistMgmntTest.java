import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmntTest {

    private final Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
    private final Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(trainIdPattern.matcher("TRN-1234").matches());
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(trainIdPattern.matcher("TRAIN12").matches());
        assertFalse(trainIdPattern.matcher("TRN12A").matches());
        assertFalse(trainIdPattern.matcher("1234-TRN").matches());
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(cargoCodePattern.matcher("PET-AB").matches());
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(cargoCodePattern.matcher("PET-ab").matches(), "Cargo code should be uppercase");
        assertFalse(cargoCodePattern.matcher("PET123").matches());
        assertFalse(cargoCodePattern.matcher("AB-PET").matches());
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(trainIdPattern.matcher("TRN-123").matches(), "Should have exactly 4 digits");
        assertFalse(trainIdPattern.matcher("TRN-12345").matches(), "Should have exactly 4 digits");
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(cargoCodePattern.matcher("PET-aB").matches());
        assertFalse(cargoCodePattern.matcher("pet-AB").matches());
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(trainIdPattern.matcher("").matches());
        assertFalse(cargoCodePattern.matcher("").matches());
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(trainIdPattern.matcher("TRN-1234Extra").matches());
        assertFalse(cargoCodePattern.matcher("PET-AB1").matches());
    }
}
