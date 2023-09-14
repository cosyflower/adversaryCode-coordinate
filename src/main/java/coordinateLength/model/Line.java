package coordinateLength.model;

import coordinateLength.model.Dots;
import coordinateLength.utils.Util;
import coordinateLength.view.OutputView;

public class Line {
    private final Dots dots;

    public Line(String s) {
        this.dots = new Dots(s);
    }

    public double calculateLength() {
        return dots.getLengthBetweenDots();
    }

    public Dots getLine() {
        return dots;
    }
}
