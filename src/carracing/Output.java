package carracing;

public class Output {

    public static void printPracticeResult() {
        System.out.println("\n" + "실행 결과");
    }

    public static void printCarRacingStatus(RacingRepeatCount repeatCount, Cars cars) {
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            cars = cars.repeatCarRacingGame();
            printHyphenByPositionCount(cars);
        }
        printResult(cars);
    }

    public static void printHyphenByPositionCount(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : ");
            for (int j = 0; j < car.getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printResult(Cars cars) { // 마지막에 출력
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : ");
            for (int j = 0; j < car.getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinnerNames(Winner winner) { // 마지막에 출력
        StringBuilder winnerNames = new StringBuilder();
        for (String name : winner.getWinnerNames()) {
            winnerNames.append(name).append(", ");
        }
        winnerNames.delete(winnerNames.length() - 2, winnerNames.length());
        System.out.println(winnerNames + "가 최종 우승했습니다.");
    }

}
