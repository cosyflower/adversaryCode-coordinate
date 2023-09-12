import java.util.Objects;

public class Liter {
    private final double liter;

    public Liter(double distancePerLiter) {
        this.liter = distancePerLiter;
    }

    public double getFuel() {
        return liter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Liter liter1 = (Liter) o;
        return Double.compare(liter1.liter, liter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liter);
    }
}
