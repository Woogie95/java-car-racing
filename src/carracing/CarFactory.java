package carracing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<String> divideCarName(String carName) {
        return List.of(carName.split(","));
    }

    public static Cars createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName, 0));
        }
        return new Cars(cars);
    }

}
