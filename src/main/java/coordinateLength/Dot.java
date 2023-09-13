package coordinateLength;

import coordinateLength.utils.Util;

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


}
