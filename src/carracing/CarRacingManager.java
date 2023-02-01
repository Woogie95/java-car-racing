package carracing;

public class CarRacingManager {

    public void runCarRacing() {
        Cars cars = CarFactory.createCars(CarFactory.divideCarNameByComma(Input.inputRacingCarName()));
        RacingRepeatCount repeatCount = new RacingRepeatCount(Input.inputRepeatCount());
        Output.printRunResult();
        Output.printWinnerNames(repeatCarRacingRound(repeatCount, cars));
    }

    private Winner repeatCarRacingRound(RacingRepeatCount repeatCount, Cars cars) {
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            cars = cars.saveNewCars();
            Output.printHyphenByPositionCount(cars);
        }
        Output.printCarRacingResult(cars);
        return new Winner(cars.addWinnerNames(cars.findCarMaxPosition(repeatCount)));
    }

}
