package coordinateLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DotTest {
    private static Dot dotForRight;
    private static Dot dotForWrong;

    @Test
    void Dot_Validation() {
        Assertions.assertDoesNotThrow(() -> new Dot("(24,4)"));

        org.assertj.core.api.Assertions.assertThatThrownBy(() -> new Dot("(25,4)"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("범위");

        org.assertj.core.api.Assertions.assertThatThrownBy(() -> new Dot("25,4)"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("입력 형식");

        org.assertj.core.api.Assertions.assertThatThrownBy(() -> new Dot("(25 4)"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageStartingWith("입력 형식");
    }


}
