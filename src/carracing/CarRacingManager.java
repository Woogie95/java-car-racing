package carracing;

public class CarRacingManager {

    public void runCarRacing() {
        Cars cars = CarFactory.createCar(CarFactory.divideCarName(Input.inputRacingCarName()));
        RacingRepeatCount repeatCount = new RacingRepeatCount(Input.inputRepeatCount());
        Output.printPracticeResult();


        Output.printCarRacingStatus(repeatCount, cars);
        Output.printWinnerNames(cars.findCarPositionMax(repeatCount));
    }
}
