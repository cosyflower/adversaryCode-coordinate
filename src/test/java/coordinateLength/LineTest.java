package coordinateLength;

import coordinateLength.model.Line;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    void Line_Construct() {
        Line line = new Line("(1,1)-(1,10)");
        double length = line.calculateLength();
        Assertions.assertEquals(length, 9);
    }

    @Test
    void Line_Calculate() {
        Line line = new Line("(10,10)-(14,15)");
        double length = line.calculateLength();
        Assertions.assertEquals(length, 6.403, 0.001);
    }




}
