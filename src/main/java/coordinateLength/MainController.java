package coordinateLength;

import coordinateLength.model.Line;
import coordinateLength.view.OutputView;

public class MainController {
    private Line line;

    public MainController() {
        setup();
        execute();
    }

    private void setup() {
        this.line = InputController.inputLine();
    }

    private void execute() {
        OutputView.showLine(line);
        OutputView.showLength(line.calculateLength());
    }
}
