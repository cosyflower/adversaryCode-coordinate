public class Sonata extends Car {
    public static final double SONATA_FUEL_EFFICIENCY = 10;

    public Sonata(Double distance) {
        super(distance);
        fuelEfficiency = new Liter(SONATA_FUEL_EFFICIENCY);
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency.getFuel();
    }

    @Override
    double getTripDistance() {
        return distance.getDistance();
    }

    @Override
    String getName() {
        return null;
    }
}
