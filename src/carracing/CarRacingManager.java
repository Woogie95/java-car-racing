package carracing;

public class CarRacingManager {

    public void runCarRacing() {
        Cars cars = CarFactory.createCar(CarFactory.divideCarName(Input.inputRacingCarName()));
        RacingRepeatCount repeatCount = new RacingRepeatCount(Input.inputRepeatCount());
        Output.printCarRacingStatus(repeatCount.getRepeatCount(), cars);
        Output.printPracticeResult();
        Output.printResult(cars);
        Output.printWinnerNames(cars);
    }
}
