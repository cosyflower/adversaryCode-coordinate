package rentCarsV1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rentCarsV1.*;

public class CarTest {
    private static Distance distance;
    private static Liter fuelEfficiency;
    private static Liter requiredLiter;

    @Test
    void sonata_Test() {
        Car sonata = new Sonata(260.0); // 26리터 필요하다

        distance = new Distance(sonata.getTripDistance());
        fuelEfficiency = new Liter(sonata.getDistancePerLiter());
        requiredLiter = new Liter(sonata.getChargeQuantity());

        Assertions.assertEquals(distance, new Distance(260));
        Assertions.assertEquals(fuelEfficiency, new Liter(10));
        Assertions.assertEquals(requiredLiter, new Liter(26));
    }

    @Test
    void KFive_Test() {
        Car k5 = new K5((double) 260);

        distance = new Distance(k5.getTripDistance());
        fuelEfficiency = new Liter(k5.getDistancePerLiter());
        requiredLiter = new Liter(k5.getChargeQuantity());

        Assertions.assertEquals(distance, new Distance(260));
        Assertions.assertEquals(fuelEfficiency, new Liter(13));
        Assertions.assertEquals(requiredLiter, new Liter(20));
    }

    @Test
    void Avante_Test() {
        Car avante = new Avante((double) 300);

        distance = new Distance(avante.getTripDistance());
        fuelEfficiency = new Liter(avante.getDistancePerLiter());
        requiredLiter = new Liter(avante.getChargeQuantity());

        Assertions.assertEquals(distance, new Distance(300));
        Assertions.assertEquals(fuelEfficiency, new Liter(15));
        Assertions.assertEquals(requiredLiter, new Liter(20));
    }
}
