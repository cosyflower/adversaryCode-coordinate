public class K5 extends Car {
    public static final double K5_FUEL_EFFICIENCY = 13;
    public static final String K5_NAME = "K5";

    public K5(Double distance) {
        super(distance);
        fuelEfficiency = new Liter(K5_FUEL_EFFICIENCY);
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency.getFuel(); // 13
    }

    @Override
    double getTripDistance() {
        return distance.getDistance();
    }

    @Override
    String getName() {
        return K5_NAME;
    }
}
