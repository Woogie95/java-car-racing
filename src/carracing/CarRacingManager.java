package carracing;

import java.util.List;

import static carracing.CarFactory.INITIAL_POSITION;

public class CarRacingManager {

    public void runCarRacing() {
        Car car = new Car(Input.inputRacingCarName());
        Cars cars = CarFactory.createCars(car.divideCarNameByComma());
        RacingRepeatCount repeatCount = new RacingRepeatCount(Input.inputRepeatCount());
        Output.printRunResult();
        Output.printWinnerNames(repeatCarRacingRound(repeatCount, cars));
    }

    private List<Car> repeatCarRacingRound(RacingRepeatCount repeatCount, Cars cars) { // 많은 일을 하고 있다고 느꼈는데 좋지 않은 로직인가 ??
        int maxPosition = INITIAL_POSITION;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            cars = cars.changeInitialCars();
            Output.printHyphenByPositionCount(cars);
            maxPosition = cars.findCarMaxPosition(repeatCount);
        }
        Output.printCarRacingResult(cars);
        return cars.findEqualsMaxPosition(maxPosition);
    }

}
