package carracing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static carracing.CarFactory.INITIAL_POSITION;

public class Cars {

    private static final int MOVABLE_MIN_VALUE = 4;
    private static final int RANDOM_NUMBER_MAX_VALUE = 10;

    private static final Random RANDOM = new Random();

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars changeInitialCars() {
        List<Car> cars = new ArrayList<>();
        for (Car car : this.cars) {
            if (isCheckPositionValue()) {
                car = car.addPosition();
            }
            cars.add(car);
        }
        return new Cars(cars);
    }

    private boolean isCheckPositionValue() {
        return RANDOM.nextInt(RANDOM_NUMBER_MAX_VALUE) >= MOVABLE_MIN_VALUE;
    }

    public int findCarMaxPosition(RacingRepeatCount repeatCount) {
        int maxPosition = INITIAL_POSITION;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            for (Car car : this.cars) {
                maxPosition = car.isMaxPosition(maxPosition);
            }
        }
        return maxPosition;
    }

    public List<Car> findEqualsMaxPosition(int maxPosition) { // Cars 에서 Car 객체의 게터는 써도 되는가...?
        List<Car> winnerCarNames = new ArrayList<>(); // 나는 가능하다고 생각을 하였다. 어차피 Cars 에서 관리되고 있는 자동차 들이기 때문이다.
        for (Car car : this.cars) {
            if (car.isMaxPositionEquals(maxPosition)) {
                winnerCarNames.add(car);
            }
        }
        return winnerCarNames;
    }

    public List<Car> getCars() {
        return cars;
    }

}
