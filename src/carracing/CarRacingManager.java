package carracing;

public class CarRacingManager {

    public void startCarRacing() {
        Cars cars = CarFactory.createCars(
                CarFactory.divideInputCarNames(
                        Input.inputCarName()));
        CarRacingGameCount carRacingGameCount = new CarRacingGameCount(Input.inputRepeatCount());
        Output.printImplementResult();
        for (int i = 0; i < carRacingGameCount.getGameCount(); i++) {
            cars = cars.repeat();
            Output.printCurrentStatus(cars);
        }
        Output.printCurrentStatus(cars);
        Winner winner = cars.findCarPositionMaxValue();
        Output.printWinnerName(winner);
    }

}
