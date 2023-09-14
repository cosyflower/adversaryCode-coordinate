package coordinateLength;

import coordinateLength.model.Dots;
import coordinateLength.model.Line;
import coordinateLength.view.InputView;

public class InputController {

    public static Line inputLine() {
        try {
            return new Line(InputView.inputTwoDots());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputLine();
        }
    }
}
