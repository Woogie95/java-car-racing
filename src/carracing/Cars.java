package carracing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private static final Random RANDOM = new Random();

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars repeatCarRacingGame() {
        List<Car> cars = new ArrayList<>();
        for (Car car : this.cars) {
            if (isCheckPositionValue()) {
                car = car.addPosition();
            }
            cars.add(car);
        }
        return new Cars(cars);
    }

    public boolean isCheckPositionValue() {
        return RANDOM.nextInt(10) >= 4;
    }

    public int findCarMaxPosition(RacingRepeatCount repeatCount) {
        int maxPosition = 0;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            for (Car car : this.cars) {
                maxPosition = Math.max(car.getPosition(), maxPosition);
            }
        }
        return maxPosition;
    }

    public List<String> findEqualsMaxPosition(int maxPosition) {
        List<String> carNames = new ArrayList<>();
        for (Car car : this.cars) {
            if (maxPosition == car.getPosition()) {
                carNames.add(car.getCarName());
            }
        }
        return carNames;
    }

    public List<Car> getCars() {
        return cars;
    }

}
