package carracing;

import java.util.List;

public class Output {

    private static final int LAST_COMMA_REMOVE = 2;
    private static final String CHANGE_POSITION_TO_HYPHEN = "-";
    private static final String DIVIDE_TO_COLON_CRITERIA = " : ";
    private static final String DIVIDE_CRA_NAME_BY_COMMA_BLANK_CRITERIA = ", ";

    public static void printRunResult() {
        System.out.println("\n" + "실행 결과");
    }

    public static void printHyphenByPositionCount(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + DIVIDE_TO_COLON_CRITERIA);
            for (int j = 0; j < car.getPosition(); j++) {
                System.out.print(CHANGE_POSITION_TO_HYPHEN);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printCarRacingResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + DIVIDE_TO_COLON_CRITERIA);
            for (int j = 0; j < car.getPosition(); j++) {
                System.out.print(CHANGE_POSITION_TO_HYPHEN);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinnerNames(List<String> winnerNames) {
        StringBuilder winnerName = new StringBuilder();
        for (String name : winnerNames) {
            winnerName.append(name).append(DIVIDE_CRA_NAME_BY_COMMA_BLANK_CRITERIA);
        }
        winnerName.delete(winnerName.length() - LAST_COMMA_REMOVE, winnerName.length());
        System.out.println(winnerName + "가 최종 우승했습니다.");
    }

}
