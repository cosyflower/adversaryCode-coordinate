package coordinateLength;

import coordinateLength.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DotValidatorTest {
    private static DotValidator dotValidator;
    @Test
    void dot_Validation() {
        Assertions.assertDoesNotThrow(() -> new DotValidator("(2,4)"));
        Assertions.assertDoesNotThrow(() -> new DotValidator("(12,14)"));
        Assertions.assertDoesNotThrow(() -> new DotValidator("(26,1)"));
    }

    @Test
    void wrong_Dot() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DotValidator("(24)"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DotValidator("(12,14"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DotValidator("26,1"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new DotValidator("(26,123)"));
    }

    @Test
    void remove_Brace() {
        String result = Util.removeBraces("(1,2)");
        Assertions.assertEquals(result, "1,2");
    }
}
