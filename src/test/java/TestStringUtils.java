import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStringUtils {
    @Test
    public void stringUtils() {
        StringUtils utils=new StringUtils();
        assertFalse(utils.isPositiveNumber("-4"));
        assertFalse(utils.isPositiveNumber("-6"));
        assertTrue(utils.isPositiveNumber("7"));
        assertTrue(utils.isPositiveNumber("100"));
        assertFalse(utils.isPositiveNumber("Hello"));

    }
}
