package coordinateLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XYCoordinateTest {
    @Test
    void XYCoordinate_Validation() {
        Assertions.assertDoesNotThrow(() -> new XCoordinate(24));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new XCoordinate(25));

        Assertions.assertDoesNotThrow(() -> new YCoordinate(24));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new YCoordinate(25));
    }


}
