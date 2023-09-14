package coordinateLength.model;

import coordinateLength.utils.Util;
import coordinateLength.validator.LineValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dots {

    public static final int FIRST_DOT_INDEX = 0;
    public static final int SECOND_DOT_INDEX = 1;

    private final List<Dot> filledDots;

    public Dots(String s) {
        new LineValidator(s);
        filledDots = new ArrayList<>();
        Arrays.stream(s.split("-"))
                .forEach((dot) -> filledDots.add(new Dot(dot)));
    }

    public List<Dot> getDots() {
        return new ArrayList<>(filledDots);
    }

    public Dot getNthDot(int nth) {
        return new ArrayList<>(filledDots).get(nth);
    }

    public int getXDiff() {
        return Math.abs(getNthDot(FIRST_DOT_INDEX).getXValue() -
                getNthDot(SECOND_DOT_INDEX).getXValue());
    }

    public int getYDiff() {
        return Math.abs(getNthDot(FIRST_DOT_INDEX).getYValue()
                - getNthDot(SECOND_DOT_INDEX).getYValue());
    }

    public double getLengthBetweenDots() {
        return Math.sqrt(Util.squareNumber(getXDiff()) + Util.squareNumber(getYDiff()));
    }
}
