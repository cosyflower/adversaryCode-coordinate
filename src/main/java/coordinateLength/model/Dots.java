package coordinateLength.model;

import coordinateLength.utils.Util;
import coordinateLength.validator.LineValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dots {

    private final List<Dot> twoDots;

    public Dots(String s) {
        new LineValidator(s);
        twoDots = new ArrayList<>();
        Arrays.stream(s.split("-"))
                        .forEach((dot) -> twoDots.add(new Dot(dot)));
    }

    public List<Dot> getDots() {
        return new ArrayList<>(twoDots);
    }

    public Dot getFirstDot() { // for Refactor
        return new ArrayList<>(twoDots).get(0);
    }

    public Dot getSecondDot() { // for Refactor
        return new ArrayList<>(twoDots).get(1);
    }

    public int getXDiff() {
        return Math.abs(getFirstDot().getXValue() - getSecondDot().getXValue());
    }

    public int getYDiff() {
        return Math.abs(getFirstDot().getYValue() - getSecondDot().getYValue());
    }

    public double getLengthBetweenDots() {
        return Math.sqrt(Util.squareNumber(getXDiff()) + Util.squareNumber(getYDiff()));
    }
}
