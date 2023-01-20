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

    public Winner findCarPositionMax(RacingRepeatCount repeatCount) { // 반환 타입을 왠만하면 객체로 한다.
        int maxPosition = 0;
        for (int i = 0; i < repeatCount.getRepeatCount(); i++) {
            for (Car car : this.cars) {
                maxPosition = Math.max(car.getPosition(), maxPosition);
            }
        }
        List<String> carPositionMaxValueName = findEqualsMaxPosition(maxPosition);
        return new Winner(carPositionMaxValueName);
    }

    private List<String> findEqualsMaxPosition(int maxPosition) {
        List<String> maxPositionNames = new ArrayList<>();
        for (Car car : this.cars) {
            System.out.println(car.getPosition()+"?????");
            if (car.getPosition() == maxPosition) {
                maxPositionNames.add(car.getCarName());
            }
        }
        return maxPositionNames;
    }

    public List<Car> getCars() {
        return cars;
    }

}
