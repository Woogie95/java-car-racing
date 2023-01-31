package carracing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static final int INITIAL_POSITION = 0;

    public static Cars createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name, INITIAL_POSITION));
        }
        return new Cars(cars);
    }

}
