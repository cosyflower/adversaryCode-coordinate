package rentCarsV2;

import sun.security.x509.AVA;

public class AVante implements Car{
    public static final int AVANTE_FUEL_EFFICIENCY = 15;

    private final double distance;

    public AVante(double movingDistance) {
        this.distance = movingDistance;
    }

    @Override
    public double requireFuel() {
        return distance / AVANTE_FUEL_EFFICIENCY;
    }
}
