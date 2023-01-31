package carracing;

import java.util.List;

public class CarRacingManager {

    public void runCarRacing() {
        Cars cars = CarFactory.createCars(CarFactory.divideCarName(Input.inputRacingCarName()));

        RacingRepeatCount repeatCount = new RacingRepeatCount(Input.inputRepeatCount());

        Output.printRunResult();

        Output.printWinnerNames(new Winner(repeatCarRacingRound(repeatCount, cars)));

    }
    public List<String> repeatCarRacingRound(RacingRepeatCount repeatCount, Cars cars) {
        int maxPosition = 0;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            cars = cars.repeatCarRacingGame();
            Output.printHyphenByPositionCount(cars);
            maxPosition = cars.findCarMaxPosition(repeatCount);
        }
        Output.printCarRacingResult(cars);
        return cars.findEqualsMaxPosition(maxPosition);
    }

}
