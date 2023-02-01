package carracing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static carracing.CarFactory.INITIAL_POSITION;

public class Cars {

    private static final Random RANDOM = new Random();

    private static final int MOVABLE_MIN_VALUE = 4;
    private static final int RANDOM_NUMBER_MAX_VALUE = 10;

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars saveNewCars() {
        List<Car> cars = new ArrayList<>();
        for (Car car : this.cars) {
            if (isMovable()) {
                car = car.addPosition();
            }
            cars.add(car);
        }
        return new Cars(cars);
    }

    private boolean isMovable() {
        return RANDOM.nextInt(RANDOM_NUMBER_MAX_VALUE) >= MOVABLE_MIN_VALUE;
    }

    public int findCarMaxPosition(RacingRepeatCount repeatCount) {
        int maxPosition = INITIAL_POSITION;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            for (Car car : this.cars) {
                maxPosition = car.addMaxPosition(maxPosition);
            }
        }
        return maxPosition;
    }

    public List<String> addWinnerNames(int maxPosition) {
        List<String> winnerNames = new ArrayList<>();
        findEqualsMaxPosition(winnerNames, maxPosition);
        return winnerNames;
    }

    private void findEqualsMaxPosition(List<String> winnerNames, int maxPosition) {
        for (Car car : this.cars) {
            if (car.isEqualsMaxPosition(maxPosition)) {
                winnerNames.add(car.getCarName());
            }
        }
    }

    public List<Car> getCars() {
        return cars;
    }

}
