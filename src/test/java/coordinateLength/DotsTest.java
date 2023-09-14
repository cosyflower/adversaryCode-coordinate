package coordinateLength;

import coordinateLength.model.Dot;
import coordinateLength.model.Dots;
import coordinateLength.model.XCoordinate;
import coordinateLength.model.YCoordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DotsTest {
    @Test
    void dots_Constructor() {
        Dots dots = new Dots("(10,10)-(14,15)");
        Dot firstDot = dots.getFirstDot();
        Dot secondDot = dots.getSecondDot();

        Assertions.assertEquals(firstDot, new Dot("(10,10)"));
        Assertions.assertEquals(secondDot, new Dot("(14,15)"));
    }

    @Test
    void dots_ConstructorV2() {
        Dots dots = new Dots("(10,24)-(24,24)");
        Dot firstDot = dots.getFirstDot();
        Dot secondDot = dots.getSecondDot();

        Assertions.assertEquals(firstDot, new Dot("(10,24)"));
        Assertions.assertEquals(secondDot, new Dot("(24,24)"));
    }

    @Test
    void dots_Wrong_Constructor() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Dots("(1,22)-(24,25)"));
    }

    @Test
    void get_Coordinate_From_Dot() {
        Dots dots = new Dots("(10,24)-(24,24)");
        Dot firstDot = dots.getFirstDot();
        Dot secondDot = dots.getSecondDot();

        XCoordinate x = firstDot.getX();
        YCoordinate y = firstDot.getY();

        Assertions.assertEquals(x, new XCoordinate(10));
        Assertions.assertEquals(y, new YCoordinate(24));
    }


}
