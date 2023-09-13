package coordinateLength;

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
}
