package coordinateLength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dots {

    private final List<Dot> twoDots;

    public Dots(String s) {
        new LineValidator(s);
        // - 구분으로 하나씩
        twoDots = new ArrayList<>();
        Arrays.stream(s.split("-"))
                        .forEach((dot) -> twoDots.add(new Dot(dot)));
    }

    public Dot getFirstDot() {
        return new ArrayList<>(twoDots).get(0);
    }

    public Dot getSecondDot() {
        return new ArrayList<>(twoDots).get(1);
    }
}
