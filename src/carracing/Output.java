package carracing;

public class Output {

    public static void printImplementResult() {
        System.out.println();
        System.out.println("실행결과");
    }

    public static void printCurrentStatus(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getCarName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinnerName(Winner winner) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : winner.getWinnersName()) {
            stringBuilder.append(name).append(", ");
        }
        System.out.println(stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length()) + "가 최종 우승했습니다.");
    }

}
