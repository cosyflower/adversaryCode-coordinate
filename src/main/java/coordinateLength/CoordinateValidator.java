package coordinateLength;

import coordinateLength.utils.Constants;

public class CoordinateValidator {

    public CoordinateValidator(int value) {
        isInRange(value);
    }

    private void isInRange(int value) {
        if (value > 24 || value < 0) {
            throw new IllegalArgumentException(Constants.NOT_IN_RANGE_ERROR);
        }
    }
}
