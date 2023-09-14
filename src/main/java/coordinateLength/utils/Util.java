package coordinateLength.utils;

import java.util.stream.IntStream;

public class Util {
    public static final int BRACE_INDEX = 1;
    public static final int TWO_SQUARE = 2;

    public static String removeBraces(String s) {
        return s.substring(BRACE_INDEX, s.length() - BRACE_INDEX);
    }

    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static double squareNumber(int number) {
        return Math.pow(number, TWO_SQUARE);
    }

    public static String moveX(int xValue) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(1, xValue)
                .forEach((num) -> stringBuilder.append('ㅡ'));
        stringBuilder.append('*');

        return stringBuilder.toString().replaceAll("ㅡ", " ");
    }
}
