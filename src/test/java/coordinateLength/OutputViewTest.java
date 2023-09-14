package coordinateLength;

import coordinateLength.model.Dot;
import coordinateLength.model.Dots;
import coordinateLength.model.Line;
import coordinateLength.view.OutputView;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class OutputViewTest {
    @Test
    void displayGraph() {
        OutputView outputView = new OutputView();
        outputView.showLine(new Dot("(1,15)"));
    }

    @Test
    void display_Multiple_Dots() {
        OutputView outputView = new OutputView();
        outputView.showLine(new Line("(10,10)-(14,15)"));
    }

    @Test
    void display_Line() {
        Line line = new Line("(1,10)-(12,17)");
        OutputView.showLine(line);
    }

    @Test
    void refactor_Display() {
        Dot displayingDot = new Dot("(10,14)");
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(1, displayingDot.getXValue())
                .forEach((num) -> stringBuilder.append('ㅡ'));
        stringBuilder.append('*');
        String builtString = stringBuilder.toString();

        String afterString = builtString.replaceAll("ㅡ", " ");
        System.out.println(afterString);
    }
}
