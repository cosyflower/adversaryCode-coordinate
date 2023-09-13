package coordinateLength;

import java.util.Objects;

public class YCoordinate extends CoordinateValidator{

    private final int y;

    public YCoordinate(int yValue) {
        super(yValue);
        this.y = yValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YCoordinate that = (YCoordinate) o;
        return y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }
}
