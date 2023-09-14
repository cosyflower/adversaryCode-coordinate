package coordinateLength.model;

import coordinateLength.validator.CoordinateValidator;

import java.util.Objects;

public class XCoordinate extends CoordinateValidator {

    private final int x;

    public XCoordinate(int xValue) {
        super(xValue);
        this.x = xValue;
    }

    public int getXValue() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XCoordinate that = (XCoordinate) o;
        return x == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
