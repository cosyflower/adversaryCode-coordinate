public class K5 extends Car {
    public static final double K5_FUEL_EFFICIENCY = 13;

    public K5(Double distance) {
        super(distance);
        fuelEfficiency = new Liter(K5_FUEL_EFFICIENCY);
    }

    @Override
    double getDistancePerLiter() {
        return 0; // 13
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}
