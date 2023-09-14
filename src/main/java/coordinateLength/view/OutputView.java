package coordinateLength.view;

import coordinateLength.model.Dot;
import coordinateLength.model.Dots;
import coordinateLength.model.Line;
import coordinateLength.utils.Constants;
import coordinateLength.utils.Util;

import java.util.List;
import java.util.stream.IntStream;

public class OutputView {

    public static final int START_INCLUSIVE = 0;
    public static final int END_EXCLUSIVE = 24;
    public static final int DISPLAY_CORRECTION_ON_XAXIS = 1;

    public static void showLength(Double length) {
        System.out.println(Constants.BETWEEN_TWO_DOTS_MESSAGE + length);
    }
    public static void showLine(Dot displayingDot) {
        displayDot(displayingDot);
        printXAxis();
        printXAxisValues();
        System.out.println();
    }

    public static void showLine(Dots multipleDots) {
        displayDots(multipleDots);
        printXAxis();
        printXAxisValues();
        System.out.println();
    }

    public static void showLine(Line line) {
        displayDots(line.getLine());
        printXAxis();
        printXAxisValues();
        System.out.println();
    }

    private static void checkDots(int YAxisConsole, Dots displayingDots) {
        List<Dot> identifiedDots = displayingDots.getDots();
        for (Dot identifiedDot : identifiedDots) {
            checkDot(YAxisConsole, identifiedDot);
        }
    }

    private static void checkDot(int YAxisConsole, Dot displayingDot) {
        if (END_EXCLUSIVE - YAxisConsole == displayingDot.getYValue()) {
            System.out.print(Util.moveX(displayingDot.getXValue())); // 시작점 0 맞추기 위함
        }
    }

    // 복수 개의 점을 출력하고 싶을 떄는 ??
    private static void displayDot(Dot displayingDot) {
        IntStream.range(START_INCLUSIVE, END_EXCLUSIVE)
                .forEach(
                        (number) -> {
                            printYAxisWithValues(number);
                            checkDot(number, displayingDot); // 여기에서 비교해야 함
                            System.out.println();
                        }
                );
    }

    private static void displayDots(Dots displayingDots) {
        IntStream.range(START_INCLUSIVE, END_EXCLUSIVE)
                .forEach(
                        (number) -> {
                            printYAxisWithValues(number);
                            checkDots(number, displayingDots); // 여기에서 비교해야 함
                            System.out.println();
                        }
                );
    }

    private static void printXAxis() {
        System.out.print(String.format("%3s", "+"));
        IntStream.range(START_INCLUSIVE, END_EXCLUSIVE)
                .forEach((num) -> System.out.print("ㅡ"));
        System.out.println();
    }

    private static void printXAxisValues() {
        IntStream.range(START_INCLUSIVE, END_EXCLUSIVE + DISPLAY_CORRECTION_ON_XAXIS)
                .forEach(
                        (num) -> {
                            if (num % 2 == 0) {
                                System.out.print(String.format("%3d", num));
                            }
                        }
                );
    }

    private static void printYAxisWithValues(int number) {
        if (number % 2 == 0) {
            System.out.print(String.format("%2d" + "ㅣ", 24 - number));
        }
        if (number % 2 != 0) {
            System.out.print(String.format("%3s", 'ㅣ'));
        }
    }
}
