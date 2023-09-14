package coordinateLength.view;

import coordinateLength.utils.Constants;

import java.util.Scanner;

public class InputView {
    public static String inputCoordinates() {
        System.out.println(Constants.INPUT_COORDINATES_MESSAGE);
        return new Scanner(System.in).nextLine();
    }
}
