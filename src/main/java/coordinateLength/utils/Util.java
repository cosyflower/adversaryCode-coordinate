package coordinateLength.utils;

public class Util {
    public static final int BRACE_INDEX = 1;

    public static String removeBraces(String s) {
        return s.substring(BRACE_INDEX, s.length() - BRACE_INDEX);
    }

    public static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
