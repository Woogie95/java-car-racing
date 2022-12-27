package carracing;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final int MOVABLE_MIN_VALUE = 4;

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars repeat() { //카를 하나씩 끄집어 포지션을 더해서 새로운 카스를 만들었다
        List<Car> newCars = new ArrayList<>();
        for (Car car : this.cars) {
            if (isAddPosition()) {
                car = car.addPosition();
            }
            newCars.add(car);
        }
        return new Cars(newCars);
    }

    private boolean isAddPosition() {
        return RandomNumber.createRandomNumber() >= MOVABLE_MIN_VALUE;
    }

    public Winner findCarPositionMaxValue() {
        int max = 0;
        for (Car car : this.cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }
        List<String> carPositionMaxValueName = findCarPositionLikeMaxValue(max);
        return new Winner(carPositionMaxValueName);
    }

    private List<String> findCarPositionLikeMaxValue(int max) {
        List<String> carPositionMaxValueName = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getPosition() == max) {
                carPositionMaxValueName.add(car.getCarName());
            }
        }
        return carPositionMaxValueName;
    }

    public List<Car> getCars() {
        return cars;
    }

}
