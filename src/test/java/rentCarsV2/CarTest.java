package rentCarsV2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void avante_Test() {
        Car avante = new AVante(300) {
            @Override
            public double requireFuel() {
                return 300;
            }
        };
        double requiredFuel = avante.requireFuel();
        Assertions.assertEquals(requiredFuel, 20);
    }
}
