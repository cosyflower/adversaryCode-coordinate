import java.util.Objects;

public class Distance {
    private final double distance;

    public Distance(double tripDistance) {
        this.distance = tripDistance;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return Double.compare(distance1.getDistance(), getDistance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDistance());
    }
}
