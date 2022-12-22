import org.example.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStringUtils {
    StringUtils utils = new StringUtils();

    @ParameterizedTest(name = "expected false")
    @ValueSource(strings = {"-3", "pop", "-5", "-7", "-128"})
    public void isPositiveFalse(String number) {
        assertFalse(utils.isPositiveNumber(number));

    }

    @ParameterizedTest(name = "expected true")
    @ValueSource(strings = {"3", "100", "5", "7", "128"})
    public void isPositiveTrue(String number) {
        assertTrue(utils.isPositiveNumber(number));

    }
}
