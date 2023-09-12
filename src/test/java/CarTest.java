import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    private static Distance distance;
    private static Liter fuelEfficiency;
    private static Liter requiredLiter;

    @Test
    void construct_with_Distance() {
        Car sonata = new Sonata(260.0); // 26리터 필요하다

        distance = new Distance(sonata.getTripDistance());
        fuelEfficiency = new Liter(sonata.getDistancePerLiter());
        requiredLiter = new Liter(sonata.getChargeQuantity());

        Assertions.assertEquals(distance, new Distance(260));
        Assertions.assertEquals(fuelEfficiency, new Liter(10));
        Assertions.assertEquals(requiredLiter, new Liter(26));
    }
}
