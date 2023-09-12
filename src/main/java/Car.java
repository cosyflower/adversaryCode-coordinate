public abstract class Car {
    protected Distance distance;
    protected Liter fuelEfficiency;

    abstract double getDistancePerLiter(); // 리터당 연비 정보를 입력해야 하고
    abstract double getTripDistance(); // 이동거리를 입력받는다
    abstract String getName();

    public Car(Double distance) {
        this.distance = new Distance(distance);
    }

    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
