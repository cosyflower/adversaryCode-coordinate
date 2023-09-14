package coordinateLength.utils;

import java.util.regex.Pattern;

public class Constants {
    public static final String NOT_IN_RANGE_ERROR = "범위에서 벗어난 좌표 값입니다(0-24) 다시 입력해주세요";
    public static final String WRONG_FORMAT_INPUT_ERROR = "입력 형식이 잘못되었습니다. 다시 입력해주세요";
    public static final String WRONG_LINE_FORMAT_INPUT_ERROR = "두개의 점을 잘못 입력했습니다. 형식에 맞게 다시 입력해주세요";

    public static final String INPUT_COORDINATES_MESSAGE = "좌표를 입력하세요.";
    public static final String BETWEEN_TWO_DOTS_MESSAGE = "두 점 사이의 거리는 ";

    public static final String DOT_REGEX = "^\\(\\d{1,2},\\d{1,2}\\)$";
    public static final Pattern DOT_PATTERN = Pattern.compile(DOT_REGEX);

    public static final String LINE_REGEX = "^\\(\\d{1,2},\\d{1,2}\\)-\\(\\d{1,2},\\d{1,2}\\)$";
    public static final Pattern LINE_PATTERN = Pattern.compile(LINE_REGEX);
}
