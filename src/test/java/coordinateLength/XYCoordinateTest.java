package coordinateLength;

import coordinateLength.model.XCoordinate;
import coordinateLength.model.YCoordinate;
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

    @Test
    void xCoordinate_equals_Test() {
        Assertions.assertEquals(new XCoordinate(2), new XCoordinate(2));
    }


}
