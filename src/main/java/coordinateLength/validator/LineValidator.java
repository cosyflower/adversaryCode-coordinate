package coordinateLength.validator;

import coordinateLength.utils.Constants;

public class LineValidator {

    private final String line;

    public LineValidator(String line) {
        this.line = line;
        validate();
    }

    private void validate() {
        isMatchedLineRegex();
    }

    private void isMatchedLineRegex() {
        if (!Constants.LINE_PATTERN.matcher(line).matches()) {
            throw new IllegalArgumentException(Constants.WRONG_LINE_FORMAT_INPUT_ERROR);
        }
    }
}
