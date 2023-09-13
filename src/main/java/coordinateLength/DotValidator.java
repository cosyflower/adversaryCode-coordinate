package coordinateLength;

import coordinateLength.utils.Constants;

public class DotValidator {

    private final String validatingDot;

    public DotValidator(String s) {
        this.validatingDot = s;
        validate();
    }

    public void validate() {
        isMatchedRegex();
    }

    private void isMatchedRegex() {
        if (!Constants.DOT_PATTERN.matcher(validatingDot).matches()) {
            throw new IllegalArgumentException(Constants.WRONG_FORMAT_INPUT_ERROR);
        }
    }
}
