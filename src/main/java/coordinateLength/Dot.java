package coordinateLength;

import coordinateLength.utils.Util;

import java.util.Objects;

public class Dot {
    private static final int XDOT_INDEX_IN_COORDINATES = 0;
    private static final int YDOT_INDEX_IN_COORDINATES = 1;

    private final XCoordinate xDot;
    private final YCoordinate yDot;

    public Dot(String s) {
        new DotValidator(s);
        String[] coordinates = Util.removeBraces(s).split(",");
        this.xDot = new XCoordinate(Util.toInt(coordinates[XDOT_INDEX_IN_COORDINATES]));
        this.yDot = new YCoordinate(Util.toInt(coordinates[YDOT_INDEX_IN_COORDINATES]));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot dot = (Dot) o;
        return Objects.equals(xDot, dot.xDot) && Objects.equals(yDot, dot.yDot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xDot, yDot);
    }
}
