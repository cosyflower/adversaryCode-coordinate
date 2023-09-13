package rentCarsV2;

public class Sonata implements Car{
    public static final int SONATA_FUEL_EFFICIENCY = 10;

    private final double distance;

    public Sonata(double movingDistance) {
        this.distance = movingDistance;
    }

    @Override
    public double requireFuel() {
        return distance / SONATA_FUEL_EFFICIENCY;
    }
}
