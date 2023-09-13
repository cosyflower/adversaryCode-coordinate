package rentCarsV1;

public class Avante extends Car {
    public static final double AVANTE_FUEL_EFFICIENCY = 15;
    public static final String AVANTE_NAME = "Avante";

    public Avante(Double distance) {
        super(distance);
        fuelEfficiency = new Liter(AVANTE_FUEL_EFFICIENCY);
    }

    @Override
    double getDistancePerLiter() {
        return fuelEfficiency.getFuel(); // 15
    }

    @Override
    double getTripDistance() {
        return distance.getDistance();
    }

    @Override
    String getName() {
        return AVANTE_NAME;
    }
}
