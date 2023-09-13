package coordinateLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineValidatorTest {
    @Test
    void line_Validatation() {
        Assertions.assertDoesNotThrow(() -> new LineValidator("(10,20)-(2,24)"));
        Assertions.assertDoesNotThrow(() -> new LineValidator("(11,25)-(2,24)"));

        org.assertj.core.api.Assertions.assertThatThrownBy(
                        () -> new LineValidator("(11,11)(2,24")
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("두개의 점");
    }

    @Test
    void wrong_Line_Validation() {
        org.assertj.core.api.Assertions.assertThatThrownBy(
                        () -> new LineValidator("(11,11)-(2,24")
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("두개의 점");

        org.assertj.core.api.Assertions.assertThatThrownBy(
                        () -> new LineValidator("11,11-2,24")
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("두개의 점");
    }

}
