package rentCarsV2;

public class K5 implements Car{
    public static final int K5_FUEL_EFFICIENCY = 13;

    private final double distance;

    public K5(double movingDistance) {
        this.distance = movingDistance;
    }

    @Override
    public double requireFuel() {
        return distance / K5_FUEL_EFFICIENCY;
    }
}
